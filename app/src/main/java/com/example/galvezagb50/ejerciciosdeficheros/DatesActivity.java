package com.example.galvezagb50.ejerciciosdeficheros;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class DatesActivity extends AppCompatActivity implements View.OnClickListener {

    Button boton;
    TextView resultados;
    DatePicker inicio, fin;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dates);

        resultados=(TextView)findViewById(R.id.txvResultados);
        inicio=(DatePicker)findViewById(R.id.dateInicio);
        fin =(DatePicker)findViewById(R.id.dateFinal);
        boton=(Button)findViewById(R.id.btnResultados);
        boton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v==boton)
        {
            String mes= String.valueOf(inicio.getMinDate());
            resultados.setText(mes);

        }
    }


}

