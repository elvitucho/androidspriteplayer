package com.android.vitucho.androidspriteplayer;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.widget.RelativeLayout;

public class MainActivity extends Activity {

	
	private SpriteView spriteView;
	private Handler handler = new Handler();
	private Runnable runnable;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initSpriteView();
	}

	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
	}
	

	@Override
	protected void onPause() {
		super.onPause();
		handler.removeCallbacks(runnable);
	}

	@Override
	protected void onStart() {
		super.onStart();
		runnable.run();
	}

	private void initSpriteView() {
		spriteView = new SpriteView(this);

		// schedule update
		runnable = new Runnable() {
			public void run() {
				MainActivity.this.update();
				handler.postDelayed(this, 500);
			}
		};
		
		RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.relative_layout);
		RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.MATCH_PARENT);
		relativeLayout.addView(spriteView,params);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	public void update() {
		spriteView.postInvalidate();
	}

}
