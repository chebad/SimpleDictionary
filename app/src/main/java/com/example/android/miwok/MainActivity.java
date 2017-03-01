/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);
    }

    /**
     * Opens a Numbers Activity.
     * @param view
     */
    public void openNumbersList(View view) {
        Intent i = new Intent(getApplicationContext(),NumbersActivity.class);
        startActivity(i);
    }
    /**
     * Opens a Colors Activity.
     * @param view
     */
    public void openColorsList(View view) {
        Intent i = new Intent(getApplicationContext(),ColorsActivity.class);
        startActivity(i);
    }
    /**
     * Opens a Phrases Activity.
     * @param view
     */
    public void openPhrasesList(View view) {
        Intent i = new Intent(getApplicationContext(),PhrasesActivity.class);
        startActivity(i);
    }
    /**
     * Opens a Family Activity.
     * @param view
     */
    public void openFamilyList(View view) {
        Intent i = new Intent(getApplicationContext(),FamilyActivity.class);
        startActivity(i);
    }
}
