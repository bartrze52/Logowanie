package com.example.logowanie;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public String loginpr = "Bartosz123";
    public String haslopr = "Haselko123";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.Logowanie);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText text = (EditText)findViewById(R.id.NazwaPod);
                String loginodp = text.getText().toString();
                EditText text2 = (EditText)findViewById(R.id.HasloPod);
                String hasloodp = text2.getText().toString();
                if(loginodp.length()<1 && hasloodp.length()<1)
                {}
                else if(loginodp.length()<1)
                {}
                else if(hasloodp.length()<1)
                if(loginpr == loginodp && hasloodp==haslopr) {

                }

            }
        });
    }
}