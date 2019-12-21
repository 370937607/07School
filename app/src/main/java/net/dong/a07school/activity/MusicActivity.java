package net.dong.a07school.activity;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;

import net.dong.a07school.R;

public class MusicActivity extends AppCompatActivity {

    public MediaPlayer mediaPlayer = new MediaPlayer();

    private View button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);


        //播放背景音乐
        mediaPlayer = MediaPlayer.create(this,R.raw.misic);
        mediaPlayer.setLooping(true);
        mediaPlayer.start();

        //隐藏自带标题栏
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();


        button = findViewById(R.id.back);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //设置监听事件，当activity销毁时停止音乐播放
               mediaPlayer.stop();
               finish();


            }
        });





    }



}
