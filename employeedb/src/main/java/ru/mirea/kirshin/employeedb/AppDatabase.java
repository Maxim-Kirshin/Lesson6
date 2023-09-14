package ru.mirea.kirshin.employeedb;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {SuperHero.class}, exportSchema = true, version = 2)
public abstract class AppDatabase extends RoomDatabase {
    public abstract SuperHeroDao getSuperHeroDao();
}