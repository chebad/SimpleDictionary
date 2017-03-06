package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //Create a array of words
        final ArrayList<Word> words = new ArrayList<>();

        //Adding all words to array "words"
        words.add(new Word("minto wuksus", "Dokąd idziesz?"));
        words.add(new Word("tinnә oyaase'nә", "Jak masz na imię?"));
        words.add(new Word("oyaaset...", "Mam na imię..."));
        words.add(new Word("michәksәs?", "Jak się czujesz?"));
        words.add(new Word("kuchi achit", "Czuje się dobrze."));
        words.add(new Word("әәnәs'aa?", "Idziesz?"));
        words.add(new Word("hәә’ әәnәm", "Tak, idę."));
        words.add(new Word("әәnәm", "Idę."));
        words.add(new Word("yoowutis", "Chodź."));
        words.add(new Word("әnni'nem", "Podejdź tu."));

        WordAdapter adapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
