package com.azimolabs.maskformatter.sampleapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;

import com.azimolabs.maskformatter.MaskFormatter;

public class MainActivity extends Activity {

    private static final String IBAN_MASK = "AA 9999 AAAA wwww wwww wwww";

    private static final String NUMBERS_MASK = "dd DD 1234 5678 90";

    private static final String CHARS_MASK = "AAZZ aazz @@ww ##%%";

    private static final String NUMBERS_MASKED_MASK = "999 99 9999";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupEditText(R.id.etIban, IBAN_MASK);
        setupEditText(R.id.etNumbers, NUMBERS_MASK);
        setupEditText(R.id.etChars, CHARS_MASK);
        setupEditText(R.id.ssnChars, NUMBERS_MASKED_MASK);
    }

    private void setupEditText(int layoutId, String mask) {
        EditText field = (EditText) findViewById(layoutId);
        field.addTextChangedListener(new MaskFormatter(mask, field));
    }
}
