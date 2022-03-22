package com.codeline.txintxacambio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Escolha_Moeda extends AppCompatActivity {

    public androidx.appcompat.widget.AppCompatButton Bt_DM, Bt_DE, Bt_DL, Bt_DR;
    public androidx.appcompat.widget.AppCompatButton Bt_EM, Bt_ED, Bt_EL, Bt_ER;

    public static double Valor;
    public static  String TipoMoeda;
    double DM, DE, DL, DR, EM, ED, EL, ER;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //
        DM = 63.82;
        DE = 0.89;
        DL = 0.74;
        DR = 5.16;

        EM = 71.33;
        ED = 1.11;
        EL = 0.83;
        ER = 5.76;



        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escolha_moeda);
        getSupportActionBar().hide();
        Bt_DM = findViewById(R.id.bt_DM);
        Bt_DE = findViewById(R.id.bt_DE);
        Bt_DL = findViewById(R.id.bt_DL);
        Bt_DR = findViewById(R.id.bt_DR);

        Bt_EM = findViewById(R.id.bt_EM);
        Bt_ED = findViewById(R.id.bt_ED);
        Bt_EL = findViewById(R.id.bt_EL);
        Bt_ER = findViewById(R.id.bt_ER);


    }

    public void DM_tela_calculo(View v) {

        Intent tela = new Intent(this, Calculo_Cambio.class);
        startActivity(tela);
        Valor = DM;
        TipoMoeda = "Dolar vs Metical";
    }

    public void DE_tela_calculo(View v) {

        Intent tela = new Intent(this, Calculo_Cambio.class);
        startActivity(tela);
        Valor = DE;
        TipoMoeda = "Dolar vs Euro";

    }

    public void DL_tela_calculo(View v) {

        Intent tela = new Intent(this, Calculo_Cambio.class);
        startActivity(tela);
        Valor = DL;
        TipoMoeda = "Dolar vs Libra";

    }

    public void DR_tela_calculo(View v) {

        Intent tela = new Intent(this, Calculo_Cambio.class);
        startActivity(tela);
        Valor = DR;
        TipoMoeda = "Dolar vs Real";

    }
//EURO


    public void EM_tela_calculo(View v) {

        Intent tela = new Intent(this, Calculo_Cambio.class);
        startActivity(tela);
        Valor = EM;
        TipoMoeda = "Euro vs Metical";

    }

    public void ED_tela_calculo(View v) {

        Intent tela = new Intent(this, Calculo_Cambio.class);
        startActivity(tela);
        Valor = ED;
        TipoMoeda = "Euro vs Dolar";
    }

    public void EL_tela_calculo(View v) {

        Intent tela = new Intent(this, Calculo_Cambio.class);
        startActivity(tela);
        Valor = EL;
        TipoMoeda = "Euro vs Libra";
    }


    public void ER_tela_calculo(View v) {

        Intent tela = new Intent(this, Calculo_Cambio.class);
        startActivity(tela);
        Valor = ER;
        TipoMoeda = "Euro vs Real";
    }
    public void Mais_Moeda(View v) {

        Intent tela = new Intent(this, Mais_Moedas.class);
        startActivity(tela);

    }






}