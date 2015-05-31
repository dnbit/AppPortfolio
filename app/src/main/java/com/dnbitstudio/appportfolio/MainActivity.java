package com.dnbitstudio.appportfolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

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

    public void streamerClicked(View view) {
        launchToast(getResources().getString(R.string.title_streamer));
    }

    public void scoresClicked(View view) {
        launchToast(getResources().getString(R.string.title_scores));
    }

    public void libraryClicked(View view) {
        launchToast(getResources().getString(R.string.title_library));
    }

    public void biggerClicked(View view) {
        launchToast(getResources().getString(R.string.title_bigger));
    }

    public void readerClicked(View view) {
        launchToast(getResources().getString(R.string.title_reader));
    }

    public void capstoneClicked(View view) {
        launchToast(getResources().getString(R.string.title_capstone));
    }

    public void launchToast(String appName) {
        Toast.makeText(this, "This button will launch " + appName + "!", Toast.LENGTH_SHORT).show();
    }
}


