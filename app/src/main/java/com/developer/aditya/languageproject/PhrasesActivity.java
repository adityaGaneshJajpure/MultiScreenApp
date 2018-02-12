package com.developer.aditya.languageproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_all);
        ArrayList<Words> colors = new ArrayList<>();
        colors.add(new Words("red","wetetti"));
        colors.add(new Words("mustard yellow","chiwiita"));
        colors.add(new Words("dusty yellow","topiisa"));
        colors.add(new Words("green","chokokki"));
        colors.add(new Words("brown","takaakki"));
        colors.add(new Words("gray","topoppi"));
        colors.add(new Words("black","kululli"));
        colors.add(new Words("white","kelelli"));
        WordAdapter itemAdapter = new WordAdapter(this,colors,R.color.colorPrimary);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemAdapter);
    }
}
