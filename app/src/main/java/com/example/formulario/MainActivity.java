package com.example.formulario;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button boton;
        boton = (Button) findViewById(R.id.boton);
        boton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        TextView botNombre, botApel;
        CheckBox del, centro, def, port, seguro;
        botNombre = (TextView) findViewById(R.id.botNombre);
        botApel = (TextView) findViewById(R.id.botApel);
    }
    public void onClick(Button boton){

    }
}