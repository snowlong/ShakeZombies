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

public class OpeninigActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_openinig);
        
        final Button button01 = (Button)findViewById(R.id.button01);
        final Button button02 = (Button)findViewById(R.id.button02);
        final Button button03 = (Button)findViewById(R.id.button03);
        final Button button04 = (Button)findViewById(R.id.button04);
 
        button01.setOnTouchListener(new View.OnTouchListener() {
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
        
        
        button01.setOnClickListener(new OnClickListener(){
        	public void onClick(View view) {
        		Log.v("OnClickListener: ", "onClick");
				Intent intent = new Intent(OpeninigActivity.this, AppearActivity.class);
				startActivity(intent);
        	}
        });
        
        button02.setOnClickListener(new OnClickListener(){
        	public void onClick(View view) {
        		Log.v("OnClickListener: ", "onClick");
				Intent intent = new Intent(OpeninigActivity.this, CameraActivity.class);
				startActivity(intent);
        	}
        });
        
        button03.setOnClickListener(new OnClickListener(){
        	public void onClick(View view) {
        		Log.v("OnClickListener: ", "onClick");
				Intent intent = new Intent(OpeninigActivity.this, CollectionActivity.class);
				startActivity(intent);
        	}
        });
        
        button04.setOnClickListener(new OnClickListener(){
        	public void onClick(View view) {
        		Log.v("OnClickListener: ", "onClick");
				Intent intent = new Intent(OpeninigActivity.this, StoryActivity.class);
				startActivity(intent);
        	}
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.openinig, menu);
        return true;
    }
    
}
