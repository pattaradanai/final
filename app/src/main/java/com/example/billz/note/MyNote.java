package com.example.billz.note;

import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.EditText;

public class MyNote extends AppCompatActivity {
    private SQLNote dbNote;
    private SQLiteDatabase db;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_note);{
            dbNote = new SQLNote(getApplicationContext());
            db =dbNote.getWritableDatabase();

            EditText subject = (EditText) findViewById(R.id.edit_subject);
            EditText content = (EditText) findViewById(R.id.edit_content);
            CheckBox note = (CheckBox) findViewById(R.id.checkBox);


        }
    }

}
