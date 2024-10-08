package com.example.calculadora;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.widget.TextView;
package java.calculos;
import java.calculos.operacion;

private Operacion operacion;
private String resultado = "";

        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        operacion = new Operacion();
        resultado = findViewById(R.id.resultado);

        TextView siete = findViewById(R.id.seven);
        TextView ocho = findViewById(R.id.eight);
        TextView nueve = findViewById(R.id.nine);
        TextView cuatro = findViewById(R.id.four);
        TextView cinco = findViewById(R.id.five);
        TextView seis = findViewById(R.id.six);
        TextView uno = findViewById(R.id.one);
        TextView dos = findViewById(R.id.two);
        TextView tres = findViewById(R.id.three);
        TextView punto = findViewById(R.id.dot);
        TextView cero = findViewById(R.id.zero);
        TextView igual = findViewById(R.id.igual);
        TextView entre = findViewById(R.id.entre);
        TextView por = findViewById(R.id.por);
        TextView mas = findViewById(R.id.mas);
        TextView menos = findViewById(R.id.menos);
        TextView limpiar = findViewById(R.id.AC);

        siete.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    actual += "7";
                    resultado.setText(actual);
            }
        });

        seis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                actual += "6";
                resultado.setText(actual);
            }
        });

        mas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operacion.setValor1(Double.parseDouble(actual));
                operacion.setOperacion("+");
                actual = "";
            }
        });

        igual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operacion.setValor2(Double.parseDouble(actual));
                double resultado = operacion.hacerOperacion();
                resultado.setText(String.valueOf(resultado));
                operacion.reiniciar();
            }
        });
    }
}