package com.example.aluno.imcapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.aluno.imcapp.model.Pessoa;

public class PrincipalActivity extends AppCompatActivity {

    Button btn;


    EditText nome, peso, altura;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        binding();

        //View.OnClickListener o = ;

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Pessoa p = new Pessoa();
                p.setNome(nome.getText().toString());
                p.setAltura(Double.parseDouble(altura.getText().toString()));
                p.setPeso(Double.parseDouble(peso.getText().toString()));

                Toast.makeText(getApplicationContext(),"IMC: "+p.imc()+" "+p.faixa(),Toast.LENGTH_LONG).show();


            }
        });


        //btn.setVisibility(View.VISIBLE);
    }

    private void binding() {
        btn = findViewById(R.id.btnCalcular);
        nome = findViewById(R.id.CampoNome);
        peso = findViewById(R.id.CampoPeso);
        altura = findViewById(R.id.CampoAltura);
    }
}
