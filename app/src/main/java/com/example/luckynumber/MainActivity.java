package com.example.luckynumber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn;
        EditText edt;
        Random random = new Random();
        btn=findViewById(R.id.button);
        edt=findViewById(R.id.editText);
        Intent i=new Intent(this,MainActivity2.class);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s =edt.getText().toString();
                i.putExtra("name",s);
               startActivity(i);

            }
        });



    }


}