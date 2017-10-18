package com.jiyun.administrator.yuekao.View;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowInsets;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;

import com.jiyun.administrator.yuekao.R;

public class MainActivity extends AppCompatActivity {

    private LinearLayout linearLayout;
    private Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        linearLayout = (LinearLayout) findViewById(R.id.linearLayout);
        bt = (Button) findViewById(R.id.bt_tiaozhuan);

        AlphaAnimation alphaAnimation = (AlphaAnimation) AnimationUtils.loadAnimation(MainActivity.this, R.anim.anim);

        linearLayout.startAnimation(alphaAnimation);
        alphaAnimation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                Intent intent=new Intent(MainActivity.this,LieBiaoActivity.class);
                MainActivity.this.startActivity(intent);
                finish();
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,LieBiaoActivity.class);
                MainActivity.this.startActivity(intent);
                finish();
            }
        });
    }
}
