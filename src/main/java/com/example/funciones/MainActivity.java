package com.example.funciones;
/// LUIS RICARDO VEGA HERNÁNDEZ
import android.graphics.Color;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements View.OnClickListener {

    EditText et1;

    @Override
    protected void onCreate(Bundle si) {
        super.onCreate(si);

        LinearLayout li = new LinearLayout(this);
        li.setBackgroundColor(Color.GREEN);
        li.setOrientation(LinearLayout.VERTICAL);

        TextView tv1 = new TextView(this);
        tv1.setPadding(30,50,30,50);
        tv1.setText("Dame tu nombre:");

        et1 = new EditText(this);
        et1.setTextSize(30);

        Button btnSaludar = new Button(this);
        btnSaludar.setText("Saluda");
        btnSaludar.setOnClickListener(this);

        Button btnLimpiar = new Button(this);
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setOnClickListener(view -> et1.setText(""));

        Button btnCambiarColor = new Button(this);
        btnCambiarColor.setText("Cambiar a Rojo");
        btnCambiarColor.setOnClickListener(v -> cambiarColor());

        li.addView(tv1);
        li.addView(et1);
        li.addView(btnSaludar);
        li.addView(btnLimpiar);
        li.addView(btnCambiarColor);

        setContentView(li);
    }

    @Override
    public void onClick(View view) {
        String nombreDado = et1.getText().toString();
        Toast.makeText(this, "Hola " + nombreDado, Toast.LENGTH_SHORT).show();
    }

    public void cambiarColor() {
        String texto = et1.getText().toString();
        et1.setText("");
        et1.setTextColor(Color.RED);
        et1.setText(texto);
    }
}