package com.example.javierocana_examen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;

public class Encuesta extends AppCompatActivity {
    EditText et1;
    RadioButton rb1,rb2;
    CheckBox cb1,cb2,cb3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encuesta);
                et1=findViewById(R.id.etRespu);
                cb1=findViewById(R.id.cbBasquet);
                cb2=findViewById(R.id.cbFutbol);
                cb3=findViewById(R.id.cbGimnasia);
                rb1 = findViewById(R.id.rb1);
                rb2 = findViewById(R.id.rb2);

            }

            public void enviarDatos(View v){

                Intent inttento = new Intent(this, Resumen.class);
                inttento.putExtra("dato",et1.getText().toString());
                String enviar1 = cb1.getText().toString();
                String enviar2 = cb2.getText().toString();
                String enviar3 = cb3.getText().toString();

                inttento.putExtra("dato2",enviar1+" ;"+enviar2+" ;"+enviar3);

                String radio1=rb1.getText().toString();
                String radio2=rb2.getText().toString();


                if(cb1.isChecked()==true){
                    inttento.putExtra("dato2",enviar1);
                }
                else{
                    inttento.putExtra("dato2",enviar2);
                }
                if(cb3.isChecked()==true){
                    inttento.putExtra("dato2",enviar3);
                }


                //Radio CONDICIONES
                if(rb1.isChecked()==true){
                    inttento.putExtra("dato3",radio1);
                }

                if(rb2.isChecked()==true){
                    inttento.putExtra("dato3",radio2);
                }

                startActivity(inttento);
            }


        }


