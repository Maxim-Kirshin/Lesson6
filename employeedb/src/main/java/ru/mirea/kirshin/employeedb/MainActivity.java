package ru.mirea.kirshin.employeedb;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AppDatabase db = App.getInstance().getDatabase();
        SuperHeroDao employeeDao = db.getSuperHeroDao();
        SuperHero employee = new SuperHero();
        employee.name = "Tony Stark";
        employee.salary = 10000000;
// запись сотрудников в базу
        employeeDao.insert(employee);
// Загрузка всех работников
        List<SuperHero> employees = employeeDao.getAll();
// Получение определенного работника с id = 1
        employee = employeeDao.getById(1);
// Обновление полей объекта
        employee.salary = 20000;
        employeeDao.update(employee);
        Log.d(TAG, employee.name + " " + employee.salary);
    }
}