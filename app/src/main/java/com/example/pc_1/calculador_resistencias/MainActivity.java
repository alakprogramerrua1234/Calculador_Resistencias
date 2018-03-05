package com.example.pc_1.calculador_resistencias;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Spinner one,two,three,four;
    TextView valor,tolerancia;
    String resultado,seleccionados[];
    int uno,dos,tres;
    double exp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        one = findViewById(R.id.sprimera);
        two = findViewById(R.id.ssegunda);
        three = findViewById(R.id.stercera);
        four = findViewById(R.id.scuarta);
        valor = findViewById(R.id.resultadoid);
        tolerancia = findViewById(R.id.toleranciaid);

        ArrayAdapter<CharSequence> adaptador = ArrayAdapter.createFromResource(this , R.array.ColoresR , android.R.layout.simple_spinner_item);
        adaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        one.setAdapter(adaptador);

        ArrayAdapter<CharSequence> adaptador2 = ArrayAdapter.createFromResource(this , R.array.ColoresR , android.R.layout.simple_spinner_item);
        adaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        two.setAdapter(adaptador2);

        ArrayAdapter<CharSequence> adaptador3 = ArrayAdapter.createFromResource(this , R.array.ColoresR , android.R.layout.simple_spinner_item);
        adaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        three.setAdapter(adaptador3);

        ArrayAdapter<CharSequence> adaptador4 = ArrayAdapter.createFromResource(this , R.array.ColoresEx , android.R.layout.simple_spinner_item);
        adaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        four.setAdapter(adaptador4);

    }


    public void Calcular(View view) {

        seleccionados = new String[]{one.getSelectedItem().toString(), two.getSelectedItem().toString(), three.getSelectedItem().toString()};

        for(int i=0; i<3 ; i++) {

            switch (seleccionados[i]) {
                case "Negro":
                    if (i == 0)
                        uno = 0;
                    else if (i == 1)
                        dos = 0;
                    else if (i == 2)
                        tres = 0;
                    break;
                case "Marron":
                    if (i == 0)
                        uno = 1;
                    else if (i == 1)
                        dos = 1;
                    else if (i == 2)
                        tres = 1;
                    break;
                case "Rojo":
                    if (i == 0)
                        uno = 2;
                    else if (i == 1)
                        dos = 2;
                    else if (i == 2)
                        tres = 2;
                    break;
                case "Naranja":
                    if (i == 0)
                        uno = 3;
                    else if (i == 1)
                        dos = 3;
                    else if (i == 2)
                        tres = 3;
                    break;
                case "Amarillo":
                    if (i == 0)
                        uno = 4;
                    else if (i == 1)
                        dos = 4;
                    else if (i == 2)
                        tres = 4;
                    break;
                case "Verde":
                    if (i == 0)
                        uno = 5;
                    else if (i == 1)
                        dos = 5;
                    else if (i == 2)
                        tres = 5;
                    break;
                case "Azul":
                    if (i == 0)
                        uno = 6;
                    else if (i == 1)
                        dos = 6;
                    else if (i == 2)
                        tres = 6;
                    break;
                case "Purpura":
                    if (i == 0)
                        uno = 7;
                    else if (i == 1)
                        dos = 7;
                    else if (i == 2)
                        tres = 7;
                    break;
                case "Gris":
                    if (i == 0)
                        uno = 8;
                    else if (i == 1)
                        dos = 8;
                    else if (i == 2)
                        tres = 8;
                    break;
                case "Blanco":
                    if (i == 0)
                        uno = 9;
                    else if (i == 1)
                        dos = 9;
                    else if (i == 2)
                        tres = 9;
                    break;
            }
        }

            resultado = String.valueOf(uno)+ String.valueOf(dos);
            exp = Double.parseDouble(resultado)*Math.pow(10,tres);
            resultado = String.valueOf(exp);

            switch (four.getSelectedItem().toString()) {

                case "Marron":
                    tolerancia.setText("   1%");
                    break;
                case "Rojo":
                    tolerancia.setText("   2%");
                    break;
                case "Dorado":
                    tolerancia.setText("   5%");
                    break;
                case "Plateado":
                    tolerancia.setText("   10%");
                    break;
            }

        valor.setText(resultado+" ohms");
    }


}
