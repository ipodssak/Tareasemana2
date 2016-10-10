package com.udemex.armando.contactos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Presentacion extends AppCompatActivity {
    private String nombre="";
    private String telefono="";
    private String email="";
    private String desc="";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_presentacion);
        TextView j = (TextView)findViewById(R.id.nombresineditar);
        TextView k = (TextView)findViewById(R.id.telefonosin);
        TextView l = (TextView)findViewById(R.id.emailsin);
        TextView m = (TextView)findViewById(R.id.descsin);

        nombre = getIntent().getStringExtra("nombre");
        telefono = getIntent().getStringExtra("telefono");
        email = getIntent().getStringExtra("email");
        desc = getIntent().getStringExtra("desc");
        j.setText("Nombre "+nombre);
        k.setText("Telefono"+telefono);
        l.setText("Email "+email);
        m.setText("Descrpción"+desc);

    }

    public void editar(View view){
        Intent intent = new Intent(Presentacion.this, MainActivity.class);
        intent.putExtra("nombre",""+nombre);
        intent.putExtra("telefono",telefono);
        intent.putExtra("email",email);
        intent.putExtra("desc",desc);
        startActivity(intent);
    }
}
