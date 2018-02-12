package com.developer.aditya.languageproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyMembersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_all);
        ArrayList<Words> colors = new ArrayList<>();
        colors.add(new Words("father","apa",R.mipmap.ic_launcher_round));
        colors.add(new Words("mother","ata",R.mipmap.ic_launcher_round));
        colors.add(new Words("son","angsi",R.mipmap.ic_launcher_round));
        colors.add(new Words("daughter","tune",R.mipmap.ic_launcher_round));
        colors.add(new Words("older brother","taachi",R.mipmap.ic_launcher_round));
        colors.add(new Words("younger brother","chalitti",R.mipmap.ic_launcher_round));
        colors.add(new Words("older sister","tete",R.mipmap.ic_launcher_round));
        colors.add(new Words("yonger sister","kolliti",R.mipmap.ic_launcher_round));
        colors.add(new Words("grandmother","ama",R.mipmap.ic_launcher_round));
        colors.add(new Words("grandfather","paapa",R.mipmap.ic_launcher_round));
        WordAdapter itemAdapter = new WordAdapter(this,colors,R.color.family_color);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemAdapter);
    }
}
