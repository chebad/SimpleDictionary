package com.example.android.miwok;

/**
 * Created by Damian on 05/03/2017.
 */

public class Word {
    /**
     * Miwok translation for the word
     */
    private String mMiwokTranslation;

    /**
     * Default translation for the word
     */
    private String mDefaultTranslation;

    public Word(String miwokTranslation, String defaultTranslation) {

        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
    }

    /**
     * Method is getting a Miwok word.
     *
     * @return Return a miwok word.
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    /**
     * Method is getting the default translation of Miwok word.
     *
     * @return Default translation of Miwok word.
     */
    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

}
