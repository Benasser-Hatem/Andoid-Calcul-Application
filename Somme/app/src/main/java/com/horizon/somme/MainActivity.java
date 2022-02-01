package com.horizon.somme;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText edit_text_input1;
    EditText edit_text_input2;
    Button btn_somme;
    TextView tv_somme;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
             super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edit_text_input1 = findViewById(R.id.edit_text_input1);
        edit_text_input2 = findViewById(R.id.edit_text_input2);
        btn_somme = findViewById(R.id.btn_somme);
        tv_somme = findViewById(R.id.tv_somme);
        btn_somme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int pass;
                pass= somme(edit_text_input1.getText().toString(), edit_text_input2.getText().toString());
                tv_somme.setText(""+pass);
                next(pass);
            }
        });

    }
        private void next(int pass) {
            Intent intent = new Intent(this, MainActivity2.class);
            intent.putExtra("a", pass);
            startActivity(intent);
        }


    @Override
    protected void onResume(){
        super.onResume();
    }
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }


    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    int somme(String string1, String string2) {
        int val1 = Integer.parseInt (string1);
        int val2= Integer.parseInt (string2);
        return val1 + val2;
    }

}