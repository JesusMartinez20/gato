package com.example.jmart.gato;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    int turno, contador, conta = 0;
    String letra;
    EditText caja;
    Button boton1, boton2, boton3, boton4, boton5, boton6, boton7, boton8, boton9, salir, repetir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_main);

        caja = (EditText) findViewById(R.id.caja);

        boton1 = (Button) findViewById(R.id.boton1);
        boton2 = (Button) findViewById(R.id.boton2);
        boton3 = (Button) findViewById(R.id.boton3);
        boton4 = (Button) findViewById(R.id.boton4);
        boton5 = (Button) findViewById(R.id.boton5);
        boton6 = (Button) findViewById(R.id.boton6);
        boton7 = (Button) findViewById(R.id.boton7);
        boton8 = (Button) findViewById(R.id.boton8);
        boton9 = (Button) findViewById(R.id.boton9);
        repetir = (Button) findViewById(R.id.repetir);
        salir = (Button) findViewById(R.id.salir);

        boton1.setOnClickListener(this);
        boton2.setOnClickListener(this);
        boton3.setOnClickListener(this);
        boton4.setOnClickListener(this);
        boton5.setOnClickListener(this);
        boton6.setOnClickListener(this);
        boton7.setOnClickListener(this);
        boton8.setOnClickListener(this);
        boton9.setOnClickListener(this);
        repetir.setOnClickListener(this);
        salir.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        contador++;
        turno = contador % 2;

        if (turno == 1) {
            imprimirX0('X', v);
        } else {
            imprimirX0('0', v);
        }
    }

    public void imprimirX0(char letra, View v) {
        if (v.getId() == R.id.repetir) {
            caja.setEnabled(true);
            caja.setText("");
            boton1.setEnabled(true);
            boton1.setText("");
            boton2.setEnabled(true);
            boton2.setText("");
            boton3.setEnabled(true);
            boton3.setText("");
            boton4.setEnabled(true);
            boton4.setText("");
            boton5.setEnabled(true);
            boton5.setText("");
            boton6.setEnabled(true);
            boton6.setText("");
            boton7.setEnabled(true);
            boton7.setText("");
            boton8.setEnabled(true);
            boton8.setText("");
            boton9.setEnabled(true);
            boton9.setText("");
        }

        if (v.getId() == R.id.salir) {
            System.exit(0);
        }

        if (v.getId() == R.id.boton1) {
            boton1.setText(letra + "");
            boton1.setEnabled(false);
        } else if (v.getId() == R.id.boton2) {
            boton1.setText(letra + "");
            boton1.setEnabled(false);
        } else if (v.getId() == R.id.boton3) {
            boton1.setText(letra + "");
            boton1.setEnabled(false);
        } else if (v.getId() == R.id.boton4) {
            boton1.setText(letra + "");
            boton1.setEnabled(false);
        } else if (v.getId() == R.id.boton5) {
            boton1.setText(letra + "");
            boton1.setEnabled(false);
        } else if (v.getId() == R.id.boton6) {
            boton1.setText(letra + "");
            boton1.setEnabled(false);
        } else if (v.getId() == R.id.boton7) {
            boton1.setText(letra + "");
            boton1.setEnabled(false);
        } else if (v.getId() == R.id.boton8) {
            boton1.setText(letra + "");
            boton1.setEnabled(false);
        } else if (v.getId() == R.id.boton9) {
            boton1.setText(letra + "");
            boton1.setEnabled(false);
        }

        Ganador(letra);
    }

    public void Ganador(char letra) {
        if (boton1.getText().toString().equals(letra + "") && (boton2.getText().toString().equals(letra + "")) && (boton3.getText().toString().equals(letra + ""))) {
            caja.setText("El ganador es: " + letra);
            caja.setEnabled(false);
            boton4.setEnabled(false);
            boton5.setEnabled(false);
            boton6.setEnabled(false);
            boton7.setEnabled(false);
            boton8.setEnabled(false);
            boton9.setEnabled(false);
        } else if (boton4.getText().toString().equals(letra + "") && (boton5.getText().toString().equals(letra + "")) && (boton6.getText().toString().equals(letra + ""))) {
            caja.setText("El ganador es: " + letra);
            caja.setEnabled(false);
            boton1.setEnabled(false);
            boton2.setEnabled(false);
            boton3.setEnabled(false);
            boton7.setEnabled(false);
            boton8.setEnabled(false);
            boton9.setEnabled(false);
        }else if (boton7.getText().toString().equals(letra + "") && (boton8.getText().toString().equals(letra + "")) && (boton9.getText().toString().equals(letra + ""))) {
            caja.setText("El ganador es: " + letra);
            caja.setEnabled(false);
            boton1.setEnabled(false);
            boton2.setEnabled(false);
            boton3.setEnabled(false);
            boton4.setEnabled(false);
            boton5.setEnabled(false);
            boton6.setEnabled(false);
        }else if (boton1.getText().toString().equals(letra + "") && (boton4.getText().toString().equals(letra + "")) && (boton7.getText().toString().equals(letra + ""))) {
            caja.setText("El ganador es: " + letra);
            caja.setEnabled(false);
            boton5.setEnabled(false);
            boton2.setEnabled(false);
            boton3.setEnabled(false);
            boton6.setEnabled(false);
            boton8.setEnabled(false);
            boton9.setEnabled(false);
        }else if (boton2.getText().toString().equals(letra + "") && (boton5.getText().toString().equals(letra + "")) && (boton8.getText().toString().equals(letra + ""))) {
            caja.setText("El ganador es: " + letra);
            caja.setEnabled(false);
            boton1.setEnabled(false);
            boton4.setEnabled(false);
            boton3.setEnabled(false);
            boton7.setEnabled(false);
            boton6.setEnabled(false);
            boton9.setEnabled(false);
        }else if (boton3.getText().toString().equals(letra + "") && (boton6.getText().toString().equals(letra + "")) && (boton9.getText().toString().equals(letra + ""))) {
            caja.setText("El ganador es: " + letra);
            caja.setEnabled(false);
            boton1.setEnabled(false);
            boton2.setEnabled(false);
            boton4.setEnabled(false);
            boton7.setEnabled(false);
            boton8.setEnabled(false);
            boton5.setEnabled(false);
        }else if (boton1.getText().toString().equals(letra + "") && (boton5.getText().toString().equals(letra + "")) && (boton9.getText().toString().equals(letra + ""))) {
            caja.setText("El ganador es: " + letra);
            caja.setEnabled(false);
            boton4.setEnabled(false);
            boton2.setEnabled(false);
            boton3.setEnabled(false);
            boton7.setEnabled(false);
            boton8.setEnabled(false);
            boton6.setEnabled(false);
        }else if (boton3.getText().toString().equals(letra + "") && (boton5.getText().toString().equals(letra + "")) && (boton7.getText().toString().equals(letra + ""))) {
            caja.setText("El ganador es: " + letra);
            caja.setEnabled(false);
            boton1.setEnabled(false);
            boton2.setEnabled(false);
            boton6.setEnabled(false);
            boton4.setEnabled(false);
            boton8.setEnabled(false);
            boton9.setEnabled(false);
        }else if(conta<9){
            conta++;
        }else{
            caja.setText("Empate");
        }
    }
}
