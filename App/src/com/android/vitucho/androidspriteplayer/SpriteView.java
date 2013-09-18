package com.android.vitucho.androidspriteplayer;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.view.View;

public class SpriteView extends View {
	private SpriteAnimator spriteAnimator;
	public SpriteView(Context context) {
		super(context);
		Bitmap bitmap = BitmapFactory.decodeResource(getResources(),
				R.drawable.test);

		spriteAnimator = new SpriteAnimator(bitmap, 10, 50, 30, 47, 5, 5);
	}

	@Override
	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);
		spriteAnimator.update(System.currentTimeMillis());
		spriteAnimator.draw(canvas);
	}

}
