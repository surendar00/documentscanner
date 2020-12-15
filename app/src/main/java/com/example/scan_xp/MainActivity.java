package com.example.scan_xp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.scan_xp.ui.main.MainFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);


        //so this is working fine after 5 sec it redirect to home screen
        //now make UI for home screen
        final Intent i = new Intent( MainActivity.this,HomeActivity.class);

        Thread thread =new Thread()
        {


            public void run() {
                try {
                    sleep(5000);

                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
                finally {
                    startActivity(i);
                 finish();
                    }
                }
            };thread.start();
        }

    }

