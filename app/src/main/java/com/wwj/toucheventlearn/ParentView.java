package com.wwj.toucheventlearn;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.RelativeLayout;

/**
 * Created by Administrator on 2017/12/6 0006.
 */

public class ParentView extends RelativeLayout { //爸爸

    private final String TAG = getClass().getSimpleName();

    public ParentView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) { //爸爸拿到了苹果，想分享给我吃
        Log.d(TAG, "==dispatchTouchEvent===爸爸拿到了苹果，想分享给我吃=====");
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) { //爸爸里面是否想吃苹果
        boolean intercept = false;  //false 爸爸心里面不想吃苹果    true 爸爸心里面想吃苹果
        Log.d(TAG, "==onInterceptTouchEvent=======爸爸" + (intercept ? "心里面想吃苹果" : "心里面不想吃苹果"));
        return intercept ? true : super.onInterceptTouchEvent(ev);
//        return super.onInterceptTouchEvent(ev); false
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {  //爸爸是否吃苹果
        boolean eat = false;  //false 爸爸不吃苹果    true 爸爸吃苹果
        Log.d(TAG, "===onTouchEvent=====爸爸" + (eat ? "吃了苹果" : "没有吃苹果"));
        return eat ? true : super.onTouchEvent(event);
//        retur super.onTouchEvent(event);  false;
    }
}
