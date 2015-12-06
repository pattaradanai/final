package com.example.billz.note;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Billz on 12/6/2015 AD.
 */
public class SQLNote extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "Note.db";
    private static final int DATABASE_VERSION = 1;
    private static final String COL_SUB = "subject";
    private static final String COL_CON = "content";
    private static final String COL_STATUS = "Status";

    public SQLNote(Context context){
        super(context,DATABASE_NAME,null,DATABASE_VERSION);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sqlCreateTable = "CREATE TABLE %s (" +
                "%s INTEGER PRIMARY KEY AUTOINCREMENT," +
                "%s TEXT," +
                "%s TEXT," +
                "%s TEXT)";
        sqlCreateTable = String.format(sqlCreateTable,COL_SUB,COL_CON,COL_STATUS);
        db.execSQL(sqlCreateTable);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
