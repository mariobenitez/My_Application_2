package com.bananita.mmbs.myapplication2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

/*import android.support.v7.widget.Toolbar;*/

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
/*
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
*/
        Button startAR1Btn = (Button) findViewById(R.id.startAR1_button);
        Button startAR2Btn = (Button) findViewById(R.id.startAR1_button);

        startAR1Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent nextScreen = new Intent(MainActivity.this, ArchitectActivity1.class);
                startActivity(nextScreen);


                }



        }
        );
/*
        startAR2Btn.setOnClickListener(new View.OnClickListener() {
                                           @Override
                                           public void onClick(View view) {

                                               Intent nextScreen = new Intent(MainActivity.this, ArchitectActivity2.class);
                                               startActivity(nextScreen);


                                           }



                                       }
        );

        */

        /*
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        */
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
