package net.dong.a07school.activity;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import net.dong.a07school.R;

public class HistoryActivity extends AppCompatActivity {
    private View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        view = findViewById(R.id.back);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        //隐藏自带标题栏
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();


        //制作轮播图
        final ImageView splashImageView = findViewById(R.id.SplashImageView);
        splashImageView.setBackgroundResource(R.drawable.animation_list);
        final AnimationDrawable frameAnimation
                = (AnimationDrawable) splashImageView
                .getBackground();
        splashImageView.post(new Runnable() {
            @Override
            public void run() {
                frameAnimation.start();
            }
        });
    }
}
