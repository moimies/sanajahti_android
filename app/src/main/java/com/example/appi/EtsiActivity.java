package com.example.appi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;
import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;

public class EtsiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.etsiactivity);

        TextView text = (TextView) findViewById(R.id.words_found);
        text.setMovementMethod(new ScrollingMovementMethod());
        Intent intent = getIntent();
        ArrayList<String> words = intent.getStringArrayListExtra("sanat");

        Button exitBtn = (Button) findViewById(R.id.takaisin);
        exitBtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                finish();
            }
        });





        String s = "";

        if(words.isEmpty()){
            s = "Sanoja ei löytynyt";
        }else{
            for(String sana : words){
                s += sana + "\n";
            }
        }
        text.setText(s);





    }



}
