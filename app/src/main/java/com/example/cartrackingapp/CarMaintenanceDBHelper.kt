package com.example.cartrackingapp

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.widget.Button

class CarMaintenanceDBHelper(context: Context) : SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {
    companion object {
        private const val DATABASE_NAME = "car_maintenance.db"
        private const val DATABASE_VERSION = 1 // Change if you modify the table structure
    }

    private fun tableExists(db: SQLiteDatabase, tableName: String): Boolean {
        val query = "SELECT name FROM sqlite_master WHERE type='table' AND name='$tableName'"
        val cursor = db.rawQuery(query, null)
        val exists = cursor.count > 0
        cursor.close()
        return exists
    }

    override fun onCreate(db: SQLiteDatabase) {
        db.execSQL(CREATE_TABLE_QUERY) // Execute table creation here






    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        // This method is called if the database version is increased
        // Implement logic to upgrade the schema if needed
    }

    private val CREATE_TABLE_QUERY = """
        CREATE TABLE car_maintenance (
            ID INTEGER PRIMARY KEY AUTOINCREMENT,
            Date TEXT NOT NULL,
            "Desc. of Maintenance" TEXT NOT NULL,
            Cost REAL,
            Notes TEXT,
            Photo_ID INTEGER REFERENCES photos(ID)
        );
    """




}