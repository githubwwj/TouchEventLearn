package com.wwj.toucheventlearn;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by Administrator on 2017/12/6 0006.
 */

public class ChildView extends View implements View.OnTouchListener {  //我

    private final String TAG = getClass().getSimpleName();

    public ChildView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        setOnTouchListener(this); //老婆
    }

    //我
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        boolean eat = false;  //false 我不吃苹果   true 我吃苹果
        Log.i(TAG, "====onTouchEvent===我" + (eat ? "吃苹果" : "不吃苹果"));

        return eat ? true : super.onTouchEvent(event);
    }

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {  // 老婆
        boolean eat = true;  //false 老婆不吃苹果   true 老婆吃苹果
        Log.e(TAG, "====onTouch===老婆" + (eat ? "吃苹果" : "不吃苹果"));
        return eat;
    }
}
