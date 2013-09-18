package com.android.vitucho.androidspriteplayer;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.Menu;

public class MainActivity extends Activity {

	private SpriteAnimator spriteAnimator;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initSpriteAnimator();
	}

	private void initSpriteAnimator() {
		Bitmap bitmap = BitmapFactory.decodeResource(getResources(),R.drawable.);
		spriteAnimator = new SpriteAnimator(bitmap, x, y, width, height, fps, frameCount);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
