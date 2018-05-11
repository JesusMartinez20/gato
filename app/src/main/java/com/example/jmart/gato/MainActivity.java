package com.example.jmart.gato;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    int turno, contador;
    EditText caja;
    Button boton1,boton2,boton3,boton4,boton5,boton6,boton7,boton8,boton9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_main);

        boton1=(Button)findViewById(R.id.boton1);
        boton2=(Button)findViewById(R.id.boton2);
        boton3=(Button)findViewById(R.id.boton3);
        boton4=(Button)findViewById(R.id.boton4);
        boton5=(Button)findViewById(R.id.boton5);
        boton6=(Button)findViewById(R.id.boton6);
        boton7=(Button)findViewById(R.id.boton7);
        boton8=(Button)findViewById(R.id.boton8);
        boton9=(Button)findViewById(R.id.boton9);

        boton1.setOnClickListener(this);
        boton2.setOnClickListener(this);
        boton3.setOnClickListener(this);
        boton4.setOnClickListener(this);
        boton5.setOnClickListener(this);
        boton6.setOnClickListener(this);
        boton7.setOnClickListener(this);
        boton8.setOnClickListener(this);
        boton9.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        contador++;
        turno=contador%2;

        if(turno==1){
            imprimirX0('X',v);
        }else{
            imprimirX0('0',v);
        }
    }

    public void imprimirX0(char letra, View v){
        if(v.getId()==R.id.boton1){
             boton1.setText(letra+"");
             boton1.setEnabled(false);
        }else if(v.getId()==R.id.boton2){
            boton1.setText(letra+"");
            boton1.setEnabled(false);
        }else if(v.getId()==R.id.boton3){
            boton1.setText(letra+"");
            boton1.setEnabled(false);
        }else if(v.getId()==R.id.boton4){
            boton1.setText(letra+"");
            boton1.setEnabled(false);
        }else if(v.getId()==R.id.boton5){
            boton1.setText(letra+"");
            boton1.setEnabled(false);
        }else if(v.getId()==R.id.boton6){
            boton1.setText(letra+"");
            boton1.setEnabled(false);
        }else if(v.getId()==R.id.boton7){
            boton1.setText(letra+"");
            boton1.setEnabled(false);
        }else if(v.getId()==R.id.boton8){
            boton1.setText(letra+"");
            boton1.setEnabled(false);
        }else if(v.getId()==R.id.boton9){
            boton1.setText(letra+"");
            boton1.setEnabled(false);
        }
    }
}
