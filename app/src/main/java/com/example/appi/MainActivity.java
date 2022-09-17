package com.example.appi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;

import android.widget.Button;
import android.widget.EditText;

import android.text.TextWatcher;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    private ArrayList<EditText> letterList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.letterList = new ArrayList<EditText>();
        letterList.add(findViewById(R.id.letter1));
        letterList.add(findViewById(R.id.letter2));
        letterList.add(findViewById(R.id.letter3));
        letterList.add(findViewById(R.id.letter4));
        letterList.add(findViewById(R.id.letter5));
        letterList.add(findViewById(R.id.letter6));
        letterList.add(findViewById(R.id.letter7));
        letterList.add(findViewById(R.id.letter8));
        letterList.add(findViewById(R.id.letter9));
        letterList.add(findViewById(R.id.letter10));
        letterList.add(findViewById(R.id.letter11));
        letterList.add(findViewById(R.id.letter12));
        letterList.add(findViewById(R.id.letter13));
        letterList.add(findViewById(R.id.letter14));
        letterList.add(findViewById(R.id.letter15));
        letterList.add(findViewById(R.id.letter16));

        for (EditText e : letterList) {

            e.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                    if(e.getText().length() == 1){
                        if (letterList.indexOf(e) == 0) {
                            letterList.get(1).requestFocus();
                        } else if (letterList.indexOf(e) == 1) {
                            letterList.get(2).requestFocus();
                        } else if (letterList.indexOf(e) == 2) {
                            letterList.get(3).requestFocus();
                        } else if (letterList.indexOf(e) == 3) {
                            letterList.get(4).requestFocus();
                        } else if (letterList.indexOf(e) == 4) {
                            letterList.get(5).requestFocus();
                        } else if (letterList.indexOf(e) == 5) {
                            letterList.get(6).requestFocus();
                        } else if (letterList.indexOf(e) == 6) {
                            letterList.get(7).requestFocus();
                        } else if (letterList.indexOf(e) == 7) {
                            letterList.get(8).requestFocus();
                        } else if (letterList.indexOf(e) == 8) {
                            letterList.get(9).requestFocus();
                        } else if (letterList.indexOf(e) == 9) {
                            letterList.get(10).requestFocus();
                        } else if (letterList.indexOf(e) == 10) {
                            letterList.get(11).requestFocus();
                        } else if (letterList.indexOf(e) == 11) {
                            letterList.get(12).requestFocus();
                        } else if (letterList.indexOf(e) == 12) {
                            letterList.get(13).requestFocus();
                        } else if (letterList.indexOf(e) == 13) {
                            letterList.get(14).requestFocus();
                        } else if (letterList.indexOf(e) == 14) {
                            letterList.get(15).requestFocus();
                        } else if (letterList.indexOf(e) == 15) {
                            letterList.get(0).requestFocus();
                        }
                    }
                }

                @Override
                public void afterTextChanged(Editable editable) {

                }
            });

        }
        Button etsiBtn = (Button) findViewById(R.id.etsi);
        etsiBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                boolean ready = true;
                for(EditText t : letterList){
                    if(t.getText().length() == 0){
                        ready = false;
                        break;
                    }
                }
                if(ready == true){
                    ArrayList<Character> l = getLetters();

                    Etsi etsi = new Etsi(l, v.getContext());
                    Intent intent = new Intent(v.getContext(), EtsiActivity.class);
                    intent.putStringArrayListExtra("sanat", etsi.words);
                    startActivity(intent);
                }

            }
        });

        Button nollaabtn = (Button) findViewById(R.id.nollaa);
        nollaabtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                for (EditText e : letterList) {
                    e.setText("");
                }

            }
        });
    }


    public ArrayList<Character> getLetters(){
        ArrayList<Character> letters = new ArrayList<Character>();

        for(EditText e : this.letterList){
            char c = e.getText().toString().toLowerCase().charAt(0);
            letters.add(c);
            System.out.println(e.getText());
        }
        return letters;
    }



}