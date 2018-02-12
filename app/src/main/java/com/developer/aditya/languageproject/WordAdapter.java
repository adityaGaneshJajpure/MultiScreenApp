package com.developer.aditya.languageproject;

import android.app.Activity;
import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by root on 2/8/17.
 */

public class WordAdapter extends ArrayAdapter<Words> {

    private int colorResourceId;

    public WordAdapter(Activity context , ArrayList<Words> wwords , int colorResourceId)
    {
        super(context,0,wwords);
        this.colorResourceId=colorResourceId;
    }
   public View getView(int position,View convertView, ViewGroup parent) {
       View listItemView = convertView;
       if(listItemView==null){
           listItemView= LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
       }
       Words currentWord = getItem(position);
       TextView miWorkText = (TextView)listItemView.findViewById(R.id.language_id);
       miWorkText.setText(currentWord.getMiWorkWord());
       TextView englishText = (TextView)listItemView.findViewById(R.id.default_id);
       englishText.setText(currentWord.getEnglishWord());
       ImageView imageView = (ImageView)listItemView.findViewById(R.id.img_id);
       if(currentWord.hasImage()){
           imageView.setImageResource(currentWord.getResourceId());
           imageView.setVisibility(View.VISIBLE);
       }
       else imageView.setVisibility(View.GONE);

       View textContainer = listItemView.findViewById(R.id.text_container);
       int color = ContextCompat.getColor(getContext(),colorResourceId);
       textContainer.setBackgroundColor(color);

    return listItemView;
   }
}
