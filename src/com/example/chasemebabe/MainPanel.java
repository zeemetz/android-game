package com.example.chasemebabe;

import Helper.Helper;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.Display;
import android.view.View;

public class MainPanel extends View 
{
	private Paint paint;
	public MainPanel(Context context, Point screenDimention) {
		super(context);
		paint = new Paint();
	}
	
	@Override
	protected void onDraw(Canvas canvas) {
		paint.setColor(Color.RED);
		Bitmap b = BitmapFactory.decodeResource(getResources(),R.drawable.flip1);
		canvas.drawBitmap(Helper.getResizedBitmap(b,100,100),100,10,paint);
	}
}
