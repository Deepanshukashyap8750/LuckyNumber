package com.example.luckynumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button btn;
        TextView tv;
        btn=findViewById(R.id.button2);
        tv=findViewById(R.id.textView3);
         int x=RandomNumber();
tv.setText(""+x);
Intent i =getIntent();
String sk=i.getStringExtra("name");
btn.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        sendNumber(sk,x);
    }
});

    }
    public int RandomNumber()
    {
        Random r = new Random();
        return r.nextInt(1000);
    }
    public void sendNumber  (String sk,int num)
    {
        Intent i = new Intent(Intent.ACTION_SEND);
        i.setType("text/plain");
        i.putExtra(Intent.EXTRA_SUBJECT,sk + " is got lucky today !");
        i.putExtra(Intent.EXTRA_TEXT,"My Lucky Number is " + num);
        startActivity(Intent.createChooser(i,"Choose the platform sharing"));
    }
}