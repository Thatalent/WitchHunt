package com.whitewolfstudios.witchhunt;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TitleScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_title_screen);
    }

    public void moveToMainMenu(View view)
    {
        Intent mainMenu = new Intent(this, MainMenu.class);
        startActivity(mainMenu);
    }
}
