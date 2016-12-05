package com.dream.will.activity_animation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Explode;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        //需要添加进入 动画 分解 代码   在style文件中添加<item name="android:windowContentTransitions">true</item>
        //否则不透明
        getWindow().setEnterTransition(new Explode().setDuration(1000));
        getWindow().setExitTransition(new Explode().setDuration(1000));
    }

    public void end2(View view) {
    }
}
