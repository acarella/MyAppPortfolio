package com.superflousjazzhands.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button spotifyStreamerButton;
    Button scoresAppButton;
    Button libraryAppButton;
    Button buildItBiggerAppButton;
    Button xyzReaderButton;
    Button capstoneAppButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        spotifyStreamerButton = (Button) findViewById(R.id.spotify_btn);
        scoresAppButton = (Button) findViewById(R.id.scores_btn);
        libraryAppButton = (Button) findViewById(R.id.library_btn);
        buildItBiggerAppButton = (Button) findViewById(R.id.bigger_btn);
        xyzReaderButton = (Button) findViewById(R.id.reader_btn);
        capstoneAppButton = (Button) findViewById(R.id.capstone_btn);

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                createToast((Button) v);
            }
        };

        spotifyStreamerButton.setOnClickListener(onClickListener);
        scoresAppButton.setOnClickListener(onClickListener);
        libraryAppButton.setOnClickListener(onClickListener);
        buildItBiggerAppButton.setOnClickListener(onClickListener);
        xyzReaderButton.setOnClickListener(onClickListener);
        capstoneAppButton.setOnClickListener(onClickListener);
    }

    private void createToast(Button button){
        Toast.makeText(this, "This button will launch " + button.getText(), Toast.LENGTH_SHORT).show();

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
}
