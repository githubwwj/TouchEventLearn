package com.wwj.toucheventlearn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;

public class MainActivity extends AppCompatActivity {  //妈妈

    private final String TAG = getClass().getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //妈妈 MainActivity
    //爸爸 ParentView
    //我   ChildView
    //一个事件相当于一个苹果
    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {  //妈妈
        Log.v(TAG, "====dispatchTouchEvent======妈妈拿到了苹果，想分享给爸爸====");
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        boolean eat = false;  //false 妈妈不吃苹果,扔了    true 妈妈吃了苹果
        Log.v(TAG, "====onTouchEvent====妈妈" + (eat ? "吃了苹果" : "没有吃苹果，扔了"));
        return eat ? true : super.onTouchEvent(event);
//        return super.onTouchEvent(event); super.onTouchEvent(event)等于false
    }


}
