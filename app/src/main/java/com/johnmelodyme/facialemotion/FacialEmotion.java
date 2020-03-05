package com.johnmelodyme.facialemotion;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

/**
 * @AUTHOR: John Melody Melissa
 * @COPYRIGHTED
 * @INPIRED: TAN SIN DEE
 * * I Created this software ML for fun as My GF
 *  * Inspired me to.
 */

public class FacialEmotion extends AppCompatActivity {
    private static final String TAG = "ML-FacialEmotion";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "Starting " + FacialEmotion.class.getName().toUpperCase());

    }
}
