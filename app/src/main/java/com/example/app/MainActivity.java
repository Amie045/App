package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.ActionMode;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.app.R;

public class MainActivity extends AppCompatActivity {
    private EditText etPanjang, etLebar, etTinggi;
    private Button btnHitung;
    private TextView tvHasil;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("ami", MainActivity.class.getSimpleName() + " onCreate");
        etPanjang = findViewById(R.id.etPanjang);
        etLebar = findViewById(R.id.etLebar);
        etTinggi = findViewById(R.id.etTinggi);
        btnHitung = findViewById(R.id.btnHitung);
        tvHasil = findViewById(R.id.tv_result);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer panjang = Integer.parseInt(etPanjang.getText().toString());
                Integer lebar = Integer.parseInt(etLebar.getText().toString());
                Integer tinggi = Integer.parseInt(etTinggi.getText().toString());

                tvHasil.setText(String.valueOf(panjang*lebar*tinggi));

            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("ami", MainActivity.class.getSimpleName() + " onStart");

    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.d("ami", MainActivity.class.getSimpleName() + " onResume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("ami", MainActivity.class.getSimpleName() + " onstop");
    }

}


