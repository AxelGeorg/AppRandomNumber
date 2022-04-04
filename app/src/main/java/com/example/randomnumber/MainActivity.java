package com.example.randomnumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    EditText edtMinimo;
    EditText edtMaximo;
    TextView tvResult ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtMinimo = findViewById(R.id.editTextMinimo);
        edtMaximo = findViewById(R.id.editTextMaximo);
        tvResult  = findViewById(R.id.textViewResultado);
    }

    public void ValorRandom(View view)
    {
        int iMin   = Integer.parseInt(edtMinimo.getText().toString());
        int iMax   = Integer.parseInt(edtMaximo.getText().toString());
        int iValor = new Random().nextInt((iMax - iMin) + 1) + iMin;

        tvResult.setText(Integer.toString(iValor));
    }
}