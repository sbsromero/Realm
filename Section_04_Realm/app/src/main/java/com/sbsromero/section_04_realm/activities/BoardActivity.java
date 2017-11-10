package com.sbsromero.section_04_realm.activities;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.sbsromero.section_04_realm.R;

public class BoardActivity extends AppCompatActivity {

    private FloatingActionButton btnFabAddBoard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_board);
        btnFabAddBoard = (FloatingActionButton) findViewById(R.id.fabAddBoard);
    }
}
