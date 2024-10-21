package com.example.calculadora;

import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.widget.TextView;
import android.view.View;
import calculos.*;

public class MainActivity extends AppCompatActivity {

    private operacion operacion;
    private String actual = "";
    private boolean operacionSeleccionada = false;
    private TextView resultado;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        operacion = new operacion();
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
        TextView cero = findViewById(R.id.zero);
        TextView igual = findViewById(R.id.igual);
        TextView entre = findViewById(R.id.entre);
        TextView por = findViewById(R.id.por);
        TextView mas = findViewById(R.id.mas);
        TextView menos = findViewById(R.id.menos);
        TextView limpiar = findViewById(R.id.AC);

        uno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (operacionSeleccionada) {
                    actual = "";
                    operacionSeleccionada = false;
                }
                actual += "1";
                resultado.setText(actual);
            }
        });

        dos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (operacionSeleccionada) {
                    actual = "";
                    operacionSeleccionada = false;
                }
                actual += "2";
                resultado.setText(actual);
            }
        });

        tres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (operacionSeleccionada) {
                    actual = "";
                    operacionSeleccionada = false;
                }
                actual += "3";
                resultado.setText(actual);
            }
        });

        cuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (operacionSeleccionada) {
                    actual = "";
                    operacionSeleccionada = false;
                }
                actual += "4";
                resultado.setText(actual);
            }
        });

        cinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (operacionSeleccionada) {
                    actual = "";
                    operacionSeleccionada = false;
                }
                actual += "5";
                resultado.setText(actual);
            }
        });

        seis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (operacionSeleccionada) {
                    actual = "";
                    operacionSeleccionada = false;
                }
                actual += "6";
                resultado.setText(actual);
            }
        });

        siete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (operacionSeleccionada) {
                    actual = "";
                    operacionSeleccionada = false;
                }
                actual += "7";
                resultado.setText(actual);
            }
        });

        ocho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (operacionSeleccionada) {
                    actual = "";
                    operacionSeleccionada = false;
                }
                actual += "8";
                resultado.setText(actual);
            }
        });

        nueve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (operacionSeleccionada) {
                    actual = "";
                    operacionSeleccionada = false;
                }
                actual += "9";
                resultado.setText(actual);
            }
        });

        cero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (operacionSeleccionada) {
                    actual = "";
                    operacionSeleccionada = false;
                }
                actual += "0";
                resultado.setText(actual);
            }
        });

        mas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operacion.setValor1(Double.parseDouble(actual));
                operacion.setTipo('+');
                operacionSeleccionada = true;
            }
        });

        por.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operacion.setValor1(Double.parseDouble(actual));
                operacion.setTipo('*');
                operacionSeleccionada = true;
            }
        });

        menos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operacion.setValor1(Double.parseDouble(actual));
                operacion.setTipo('-');
                operacionSeleccionada = true;
            }
        });

        entre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operacion.setValor1(Double.parseDouble(actual));
                operacion.setTipo('/');
                operacionSeleccionada = true;
            }
        });

        igual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operacion.setValor2(Double.parseDouble(actual));
                double res = operacion.hacerOperacion();
                resultado.setText(String.valueOf(res));
                actual = String.valueOf(res);
            }
        });

        limpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                actual = "";
                operacionSeleccionada = false;
                resultado.setText("");
            }
        });
    }
}
