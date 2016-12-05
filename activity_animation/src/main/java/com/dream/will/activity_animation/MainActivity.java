package com.dream.will.activity_animation;

import android.app.ActivityOptions;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void start1(View view) {
        startActivity(new Intent(this,Main3Activity.class));
        overridePendingTransition(R.anim.in,R.anim.out);
    }
    public void start2(View view) {
        //分解
        startActivity(new Intent(this,Main2Activity.class)
                , ActivityOptions.makeSceneTransitionAnimation(this).toBundle());
    }
    public void start3(View view) {
        //滑动
        startActivity(new Intent(this,Main2Activity.class)
                , ActivityOptions.makeSceneTransitionAnimation(this).toBundle());
    }

    public void start4(View view) {
        //淡入淡出
        startActivity(new Intent(this,Main4Activity.class)
                , ActivityOptions.makeSceneTransitionAnimation(this).toBundle());
    }

    public void start5(View view) {
        //共享元素动画
        startActivity(new Intent(this,Main5Activity.class)
                ,ActivityOptions.makeSceneTransitionAnimation(this,view,"myButt").toBundle());
    }
}
