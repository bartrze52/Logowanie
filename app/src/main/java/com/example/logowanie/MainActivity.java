package com.example.logowanie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    public String loginpr = "Bartosz123";
    public String haslopr = "123";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.Logowanie);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Snackbar Haslo = Snackbar.make(findViewById(R.id.Logowanie), "Podaj hasło", 10);
                Snackbar Login = Snackbar.make(findViewById(R.id.Logowanie), "Podaj login", 10);
                Snackbar HiL = Snackbar.make(findViewById(R.id.Logowanie), "Podaj login i hasło", 10);
                Snackbar Blad = Snackbar.make(findViewById(R.id.Logowanie), "Podane login lub hasło nie są poprawne", 10);

                EditText text = (EditText)findViewById(R.id.NazwaPod);
                String loginodp = text.getText().toString();
                EditText text2 = (EditText)findViewById(R.id.HasloPod);
                String hasloodp = text2.getText().toString();

                if(loginodp.length()<1 && hasloodp.length()<1)
                {
                    HiL.show();
                }
                else if(loginodp.length()<1)
                {
                    Login.show();
                }
                else if(hasloodp.length()<1)
                {
                    Haslo.show();
                }
                else if(loginpr.equals(loginodp) && hasloodp.equals(haslopr))
                {
                    startActivity(new Intent(MainActivity.this, MainActivityZalogowano.class));
                }
                else if(loginpr != loginodp && hasloodp!=haslopr)
                {
                    Blad.show();
                }

            }
        });
    }
}