package com.example.gameproto1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class AppearActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_appear);

        final Button button = (Button)findViewById(R.id.button05);
        button.setOnTouchListener(new View.OnTouchListener() {
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				switch(event.getAction()){
				case MotionEvent.ACTION_DOWN:
					// touch した時の処理
					Log.v("OnTouchListener", "ACTION_DOWN");
					break;
				case MotionEvent.ACTION_UP:
					// 指を離した時の処理
					Log.v("OnTouchListener", "ACTION_UP");
					break;
				case MotionEvent.ACTION_OUTSIDE:
					Log.v("OnTouchListener", "ACTION_CANCEL");
					break;
				}
				
				return false;
			}
        });
        
        button.setOnClickListener(new OnClickListener(){
        	public void onClick(View view) {
        		Log.v("OnClickListener: ", "onClick");
				Intent intent = new Intent(AppearActivity.this, PlayActivity.class);
				startActivity(intent);
        	}
        });
    }

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.play, menu);
		return true;
	}

}
