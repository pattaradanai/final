package com.example.billz.note;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    final TextView textView = (TextView)findViewById(R.id.textView);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button num1 = (Button) findViewById(R.id.num_1);
        Button num2 = (Button) findViewById(R.id.num_2);
        Button num3 = (Button) findViewById(R.id.num_3);
        Button num4 = (Button) findViewById(R.id.num_4);
        Button num5 = (Button) findViewById(R.id.num_5);
        Button num6 = (Button) findViewById(R.id.num_6);
        Button num7 = (Button) findViewById(R.id.num_7);
        Button num8 = (Button) findViewById(R.id.num_8);
        Button num9 = (Button) findViewById(R.id.num_9);
        Button num0 = (Button) findViewById(R.id.num_0);
        Button Delete = (Button) findViewById(R.id.delete_num);
        Button Login = (Button) findViewById(R.id.login);


        num0.setOnClickListener(new View.OnClickListener() {
             @Override
            public void onClick(View v) {
                 if(textView.length()<6){
                     textView.append("0");
                 }


             }
        });

            num1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textView.length()<6){
                    textView.append("1");
                }




            }
        });
        num2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textView.length()<6){
                    textView.append("2");
                }

            }
        });
        num3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textView.length()<6){
                    textView.append("3");
                }

            }
        });
        num4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textView.length()<6){
                    textView.append("4");
                }

            }
        });
        num5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textView.length()<6){
                    textView.append("5");
                }

            }
        });
        num6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textView.length()<6){
                    textView.append("6");
                }

            }
        });
        num7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textView.length()<6){
                    textView.append("7");
                }

            }
        });
        num8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textView.length()<6){
                    textView.append("8");
                }

            }
        });
        num9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textView.length()<6){
                    textView.append("9");
                }

            }
        });
        Delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("");
            }
        });
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textView.getText().toString() == "123456") {
                    Intent intent = new Intent(MainActivity.this, NoteActivity.class);
                    startActivity(intent);

                } else {
                    new AlertDialog.Builder(MainActivity.this)
                            .setTitle("Login Failed")
                            .setMessage("Incorrect password")
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {

                                }
                            }).show();



                }
            }
        });





    }
}

