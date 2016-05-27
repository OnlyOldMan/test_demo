package com.example.mytouch;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.Button;

public class MyButton extends Button {
	public MyButton(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
	}

	private static final String TAG = "json";
	

	@Override
	public boolean dispatchTouchEvent(MotionEvent ev) {
		int action = ev.getAction();
		switch (action) {
		case MotionEvent.ACTION_DOWN:
			Log.e(TAG, "dispatchTouchEvent ACTION_DOWN" + "Button");
			break;
		case MotionEvent.ACTION_MOVE:
			Log.e(TAG, "dispatchTouchEvent ACTION_MOVE" + "Button");
			break;
		case MotionEvent.ACTION_UP:
			Log.e(TAG, "dispatchTouchEvent ACTION_UP" + "Button");
			break;

		default:
			break;
		}
		return super.dispatchTouchEvent(ev);
	}

	@Override
	public boolean onTouchEvent(MotionEvent event) {

		int action = event.getAction();

		switch (action) {
		case MotionEvent.ACTION_DOWN:
			Log.e(TAG, "onTouchEvent ACTION_DOWN" + "Button");
			break;
		case MotionEvent.ACTION_MOVE:
			Log.e(TAG, "onTouchEvent ACTION_MOVE" + "Button");
			break;
		case MotionEvent.ACTION_UP:
			Log.e(TAG, "onTouchEvent ACTION_UP" + "Button");
			break;

		default:
			break;
		}

		return super.onTouchEvent(event);
	}

}
