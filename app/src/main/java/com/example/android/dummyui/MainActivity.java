package com.example.android.dummyui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onSave(View view) {
        ArrayList<String> choices = new ArrayList<String>();
        choices.add("my achy breaky heart");
        choices.add("is this the real life?");
        choices.add("idk man");

        ArrayList<String> characters = new ArrayList<String>();
        characters.add("Holden");
        characters.add("Avatar");
        characters.add("Icon");

        int background = R.drawable.desktop;

        String choiceText = "what a choice to choose";



        Intent intent = new Intent(this, EventActivity.class);
        intent.putExtra("choices", choices);
        intent.putExtra("characters", characters);
        intent.putExtra("background", background);
        intent.putExtra("choiceText", choiceText);

        startActivity(intent);
    }
}
