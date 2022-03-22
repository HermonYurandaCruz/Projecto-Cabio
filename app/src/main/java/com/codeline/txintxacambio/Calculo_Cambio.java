package com.codeline.txintxacambio;

import static com.codeline.txintxacambio.Escolha_Moeda.TipoMoeda;
import static com.codeline.txintxacambio.Escolha_Moeda.Valor;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Calculo_Cambio extends AppCompatActivity {
     EditText et_valor;
     TextView tv_cambio;
     TextView tv_tipoMoeda;
     androidx.appcompat.widget.AppCompatButton bt_converter;
    public  androidx.appcompat.widget.AppCompatButton Bt_DM,Bt_DE,Bt_DL,Bt_DR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculo_cambio);
        getSupportActionBar().hide();

        //referenciar
et_valor=findViewById(R.id.Et_valor1);
tv_cambio=findViewById(R.id.TV_Cambio);
bt_converter=findViewById(R.id.Bt_Converter);
tv_tipoMoeda=findViewById(R.id.TV_TipoMoeda);

// Mostrar o tipo de moeda na tela calculo camnio
        tv_tipoMoeda.setText(TipoMoeda);



bt_converter.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {

       double valorInicial=Double.parseDouble(et_valor.getText().toString());


     double ValorFInal=valorInicial*Valor;


     tv_cambio.setText((String.valueOf(ValorFInal)));





    }



});





    }




}