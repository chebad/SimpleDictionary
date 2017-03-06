package com.example.android.miwok;

import android.app.ActionBar;
import android.support.annotation.StringRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {
    int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        //Create a root view (LinearLayout) of activity_numbers.xml
        //final LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);

        //Create a array of words
        final ArrayList<Word> words = new ArrayList<>();

        //Adding all words to array "words"
        words.add(new Word("lutti", "jeden"));
        words.add(new Word("otiiko", "dwa"));
        words.add(new Word("tolookosu", "trzy"));
        words.add(new Word("oyyisa", "cztery"));
        words.add(new Word("massokka", "pięć"));
        words.add(new Word("temmokka", "sześć"));
        words.add(new Word("kenekaku", "siedem"));
        words.add(new Word("kawinta", "osiem"));
        words.add(new Word("wo'e", "dziewięć"));
        words.add(new Word("na'aacha", "dziesięć"));

        WordAdapter adapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }

    /**
     * Method witch gone execute when button is pressed.
     *
     * @param words    Array.
     * @param button   Which button is pressed.
     * @param rootView Witch layout is a root view.
     * @param editText The field where a new string is written.
     */
    public void buttonClickMethod(final ArrayList<String> words, Button button, final LinearLayout rootView, final EditText editText) {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayNewWords(words, rootView, editText.getText().toString());
            }
        });
    }

    /**
     * Method create a TextViews on rootView and write into it elements from ArrayList.
     *
     * @param words    ArrayList to display.
     * @param rootView Main view for TextViews.
     */
    public void displayArrayWords(ArrayList<String> words, LinearLayout rootView) {
        for (int i = 0; i < words.size(); i++) {
            TextView wordView = new TextView(this);
            wordView.setText(words.get(i));
            rootView.addView(wordView);
        }
    }

    /**
     * Method create a new TextView on rootView and write into ArrayList element which user write into
     * a EditText and display new element into TextView.
     *
     * @param words    ArrayList for adding new element.
     * @param rootView Main view for TextView.
     * @param addWord  New word to add into "words" ArrayList.
     */
    public void displayNewWords(ArrayList<String> words, LinearLayout rootView, String addWord) {
        words.add(addWord);
        TextView wordView = new TextView(this);
        wordView.setText(words.get(words.size() - 1));
        rootView.addView(wordView);
    }
}

