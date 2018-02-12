package com.developer.aditya.languageproject;

/**
 * Created by root on 2/8/17.
 */

public class Words {

    //variables for english and miwork


    private String englishWord;
    private String miWorkWord;
    private int imageRId=-1;

    //constructor

    public Words(String englishWord,String miWorkWord)
    {
        this.englishWord = englishWord;
        this.miWorkWord = miWorkWord;
    }

    public Words(String englishWord,String miWorkWord,int resource_id)
    {
        this.englishWord=englishWord;
        this.miWorkWord=miWorkWord;
        this.imageRId=resource_id;
    }

    //method to get englishTranslation

    public String getEnglishWord()
    {
        return englishWord;
    }

    //method to get miworkTranslation

    public String getMiWorkWord()
    {
        return miWorkWord;
    }

    //method to get resource id

    public int getResourceId()
    {
        return imageRId;
    }

    //check image or not

    public boolean hasImage() { return imageRId!=-1; }
}
