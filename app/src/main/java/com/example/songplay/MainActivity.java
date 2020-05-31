package com.example.songplay;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {
//Button aplaysong,apause;
MediaPlayer playmusic;
    Switch aSwitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        playmusic = MediaPlayer.create(this,R.raw.sun);
        aSwitch = findViewById(R.id.switch_looping);
        //the song is play when it is on or checked.
        aSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                playmusic.setLooping(isChecked);

            }
        });
    }
    //Second way to play and pause song:
    public void playsongclick (View v){
     playmusic.start();
    }
    public void pausesongclick (View v)
    {
        if (playmusic.isPlaying())
            playmusic.pause();
    }

    //First way to play and pause song:
        /*
        aplaysong = findViewById(R.id.playsong);
        apause = findViewById(R.id.pause);


        aplaysong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playmusic.start();
            }
        });
        apause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (playmusic.isPlaying())
                    playmusic.pause();
            }
        });

         */


}
