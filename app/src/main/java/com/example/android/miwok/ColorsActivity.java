package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);


        //Create a array of words
        final ArrayList<Word> words = new ArrayList<>();

        //Adding all words to array "words"
        words.add(new Word("weṭeṭṭi", "czerwony"));
        words.add(new Word("chokokki", "zielony"));
        words.add(new Word("ṭakaakki", "brązowy"));
        words.add(new Word("ṭopoppi", "szary"));
        words.add(new Word("kululli", "czarny"));
        words.add(new Word("kelelli", "biały"));
        words.add(new Word("ṭopiisә", "pustynny"));
        words.add(new Word("chiwiiṭә", "musztardowy"));

        WordAdapter adapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);


    }
}
