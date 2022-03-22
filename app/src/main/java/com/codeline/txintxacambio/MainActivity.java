package com.codeline.txintxacambio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button tela_moedas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
    }

public void Abrir_tela_escolha_moedas(View v){

        Intent tela=new Intent(this,Escolha_Moeda.class);
        startActivity(tela);

}



}