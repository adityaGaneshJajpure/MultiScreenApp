package com.developer.aditya.languageproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_all);
        ArrayList<Words> colors = new ArrayList<>();
        colors.add(new Words("red","wetetti",R.mipmap.ic_launcher_round));
        colors.add(new Words("mustard yellow","chiwiita",R.mipmap.ic_launcher_round));
        colors.add(new Words("dusty yellow","topiisa",R.mipmap.ic_launcher_round));
        colors.add(new Words("green","chokokki",R.mipmap.ic_launcher_round));
        colors.add(new Words("brown","takaakki",R.mipmap.ic_launcher_round));
        colors.add(new Words("gray","topoppi",R.mipmap.ic_launcher_round));
        colors.add(new Words("black","kululli",R.mipmap.ic_launcher_round));
        colors.add(new Words("white","kelelli",R.mipmap.ic_launcher_round));
        WordAdapter itemAdapter = new WordAdapter(this,colors,R.color.colorAccent);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemAdapter);
    }
}
