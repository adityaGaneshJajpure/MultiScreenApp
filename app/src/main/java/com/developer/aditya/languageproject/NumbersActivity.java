package com.developer.aditya.languageproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_all);
        ArrayList<Words> words = new ArrayList<>();
        words.add(new Words("one","lutti",R.mipmap.ic_launcher_round));
        words.add(new Words("two","otiiko",R.mipmap.ic_launcher_round));
        words.add(new Words("three","tolookosu",R.mipmap.ic_launcher_round));
        words.add(new Words("four","oyyisa",R.mipmap.ic_launcher_round));
        words.add(new Words("five","massokka",R.mipmap.ic_launcher_round));
        words.add(new Words("six","temmokka",R.mipmap.ic_launcher_round));
        words.add(new Words("seven","kenekaku",R.mipmap.ic_launcher_round));
        words.add(new Words("eight","kawinta",R.mipmap.ic_launcher_round));
        words.add(new Words("nine","wo'e",R.mipmap.ic_launcher_round));
        words.add(new Words("ten","na'aacha",R.mipmap.ic_launcher_round));
       /* LinearLayout linearLayout = (LinearLayout)findViewById(R.id.rootView);
        for(int i=0;i<words.size();i++) {
            TextView textView = new TextView(this);
            textView.setText(words.get(i));
            linearLayout.addView(textView);
        }*/
        WordAdapter itemAdapter = new WordAdapter(this,words,R.color.numbers_color);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemAdapter);

    }
}
