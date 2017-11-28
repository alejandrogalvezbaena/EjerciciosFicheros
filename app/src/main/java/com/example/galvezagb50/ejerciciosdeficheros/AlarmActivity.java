package com.example.galvezagb50.ejerciciosdeficheros;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class AlarmActivity extends AppCompatActivity implements OnClickListener{

    Button crearAlarma, iniciarAlarmas;
    EditText edtMinutos, edtFrase;
    TextView propiedades;
    private int numAlarm=0;
    GestorAlarma[] listaAlarmas;
    String minutos;
    String frase;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarm);

        edtMinutos = (EditText) findViewById(R.id.edtMinutos);
        edtFrase = (EditText) findViewById(R.id.edtFrase);
        propiedades = (TextView) findViewById(R.id.txvPropiedadesAlarmas);
        crearAlarma = (Button) findViewById(R.id.btnCrearAlarma);
        crearAlarma.setOnClickListener(this);
        iniciarAlarmas = (Button) findViewById(R.id.btnIniciarAlarmas);
        iniciarAlarmas.setOnClickListener(this);

        listaAlarmas=new GestorAlarma[5];
    }

        public void onClick(View view) {
        if (view==crearAlarma)
        {
            try
            {
                minutos = edtMinutos.getText().toString();
                frase=edtFrase.getText().toString();

                if ((minutos.equals(""))|(frase.equals("")))
                {
                    throw new ArrayIndexOutOfBoundsException();
                }
                else
                {
                    listaAlarmas[numAlarm] = new GestorAlarma(Integer.parseInt(minutos), frase, getApplicationContext(), "alarmas.txt");
                    propiedades.setText(listaAlarmas[numAlarm].CrearAlarma());
                    numAlarm++;
                    Toast.makeText(this, "Alarma creada correctamente", Toast.LENGTH_SHORT).show();
                    edtMinutos.setText("");
                    edtFrase.setText("");
                    edtMinutos.requestFocus();
                }
            }
            catch (ArrayIndexOutOfBoundsException e)
            {
                Toast.makeText(this, "No puedes crear mas alarmas", Toast.LENGTH_SHORT).show();
            }

        }
        if (view==iniciarAlarmas)
        {

        }
    }
}





