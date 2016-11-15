package com.whitewolfstudios.witchhunt;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
    }

    public void moveToBoard(View view)
    {
        Intent gameBoard = new Intent(this, GameBoardActivity.class);
        startActivity(gameBoard);
    }
}
