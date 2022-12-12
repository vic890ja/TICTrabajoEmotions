package com.example.ticparte1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText et1;
    private EditText et4;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        try {
            Thread.sleep (1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        setTheme(R.style.Theme_TICparte1);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = findViewById(R.id.nom);
        et4 = findViewById(R.id.nom2);

    }
    //Boton siguiente
    public void siguiente(View view) {
        Intent i = new Intent(this, MainActivity2.class);

        i.putExtra( "dato", et1.getText().toString());
        i.putExtra("dato2", et4.getText().toString());
        startActivity(i);
    }
}






