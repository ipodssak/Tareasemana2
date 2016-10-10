package com.udemex.armando.contactos;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends FragmentActivity {
    int año;

    private EditText nombre= null;
    private EditText telefono = null;
    private EditText email = null;
    private EditText descrp = null;


    private String nombree="";
    private String telefonoe="";
    private String emaile="";
    private String desce="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DatePickerFragment j =new DatePickerFragment();



        nombre = (EditText) findViewById(R.id.editText);
        telefono = (EditText) findViewById(R.id.editText2);
        email = (EditText) findViewById(R.id.editText3);
        descrp = (EditText) findViewById(R.id.emailBody);
        try {
            nombree = getIntent().getStringExtra("nombre");
            telefonoe = getIntent().getStringExtra("telefono");
            emaile = getIntent().getStringExtra("email");
            desce = getIntent().getStringExtra("desc");
            nombre.setText(nombree);
            telefono.setText(telefonoe);
            email.setText(emaile);
            descrp.setText(desce);
        }catch (Exception e){}

    }

    public void showDatePickerDialog(View v) {
        DialogFragment newFragment = new DatePickerFragment();
        newFragment.show(getSupportFragmentManager(), "datePicker");
    }
    public void enviar(View view){
        Intent intent = new Intent(MainActivity.this, Presentacion.class);
        intent.putExtra("nombre",""+nombre.getText().toString());
        intent.putExtra("telefono",telefono.getText().toString());
        intent.putExtra("email",email.getText().toString());
        intent.putExtra("desc",descrp.getText().toString());
        startActivity(intent);

    }
}
