package com.example.formapps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText InputName = (EditText) findViewById(R.id.id_input_name ); // mendevinisikan elemen nama
        EditText InputEmail = (EditText) findViewById(R.id.id_input_email );// devinisi elemen email
        EditText InputPhone = (EditText) findViewById(R.id.id_input_phone ); // devinisi elemen phonr
        EditText InputPassword = (EditText) findViewById(R.id.id_input_password ); //devinisi pwsd

        Button btnSave = (Button) findViewById(R.id.id_button_save); // devinisi elemen button simpan
        btnSave.setOnClickListener(new View.OnClickListener() { //  kode dari aksi toombil button save
            @Override
            public void onClick(View v) {



                Log.d("Name", InputName.getText().toString());
                Log.d("Email", InputEmail.getText().toString());
                Log.d("Phone", InputPhone.getText().toString());
                Log.d("Password", InputPassword.getText().toString());
            }
        });
    }
}