package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //Create a array of words
        final ArrayList<Word> words = new ArrayList<>();

        //Adding all words to array "words"
        words.add(new Word("әpә", "tata"));
        words.add(new Word("әṭa", "mama"));
        words.add(new Word("angsi", "syn"));
        words.add(new Word("tune", "córka"));
        words.add(new Word("taachi", "starszy brat"));
        words.add(new Word("chalitti", "młodszy brat"));
        words.add(new Word("teṭe", "starsza siostra"));
        words.add(new Word("kolliti", "młodsza siostra"));
        words.add(new Word("ama", "babcia"));
        words.add(new Word("paapa", "dziadek"));

        WordAdapter adapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
