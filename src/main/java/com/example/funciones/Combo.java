package com.example.funciones;
/// LUIS RICARDO VEGA HERNÁNDEZ
import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

public class Combo extends Activity {

    Spinner comboNC;
    EditText et1;

    @Override
    protected void onCreate(Bundle b) {
        super.onCreate(b);
        setContentView(R.layout.vista);

        comboNC = findViewById(R.id.comboopciones);
        et1 = findViewById(R.id.textocambio);

        String colores[] = {"Rojo", "Verde", "Azul"};

        ArrayAdapter<String> ad = new ArrayAdapter<>(
                this,
                android.R.layout.simple_spinner_item,
                colores
        );

        ad.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        comboNC.setAdapter(ad);

        comboNC.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                cambiarColor();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    public void cambiarColor() {

        int pos = comboNC.getSelectedItemPosition();

        switch (pos) {

            case 0:
                et1.setTextColor(Color.RED);
                break;

            case 1:
                et1.setTextColor(Color.GREEN);
                break;

            case 2:
                et1.setTextColor(Color.BLUE);
                break;
        }
    }
}

/// LUIS RICARDO VEGA HERNÁNDEZ