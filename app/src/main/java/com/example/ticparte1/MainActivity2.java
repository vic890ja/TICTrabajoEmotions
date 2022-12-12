package com.example.ticparte1;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    //array para frases cuando estas feliz
    String[] caraF = {
            "La vida es un regalo y no pienso desperdiciarla Nunca se sabe qué cartas repartirá la próxima vez",
            "Ser feliz no significa que todo sea perfecto Significa que has decidido ver más allá de las imperfecciones",
            "La felicidad no es algo prefabricado Viene de tus propias acciones"
    };
    int i = 0;
    //array para frases cuando estas triste
    String[] caraT = {
            "Los años parecen pasar con más rapidez a medida que te vas haciendo mayor",
            "Hay veces que un hombre tiene que luchar tanto por la vida, que no tiene tiempo de vivirla",
            "Nunca puedes querer a nadie tanto cómo puedes echarlo de menos"

    };
    int f = 0;
    //array para frases caundo estas enojado
    String[] caraE = {
            "Estar enojado es vengar el error de los demás sobre nosotros mismos",
            "El enojo es una emoción válida. Solo es malo cuando toma el control y te hace hacer cosas que no quieres hacer",
            "El enojo es una señal, una que vale la pena escuchar"
    };
    int j = 0;

    TextView tv3;


    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView tv2 = findViewById(R.id.tv2);
        tv3 = findViewById(R.id.tv3);


        //obtener nombre de activity1
        String dato = getIntent().getStringExtra("dato");
        String dato2 = getIntent().getStringExtra("dato2");
        tv2.setText("Hola " + dato + " " + dato2 + " como te sientes hoy");

    }


    //Cara feliz
    @SuppressLint("SetTextI18n")
    public void c1 (View view) {
        if (i <= 2) {
            tv3.setText(caraF[i]);
            i++;
        } else {
            i = 0;
            tv3.setText(". . .");

        }
    }

    //Cara troste
    public void c2 (View view)
    {
        if (f <= 2) {
            tv3.setText(caraT[f]);
            f++;
        } else {
            f = 0;
            tv3.setText(". . .");

        }
    }

    //cara enojada
    public void c3 (View view)
    {
        if (j <= 2) {
            tv3.setText(caraE[j]);
            j++;
        } else {
            j = 0;
            tv3.setText(". . .");

        }
    }




}