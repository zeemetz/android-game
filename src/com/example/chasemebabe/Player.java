package com.example.chasemebabe;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;

public class Player extends View 
{
	private Rect player;
	private Paint paint;
	private Picture picture;
	public Player(Context context) {
		super(context);
		player = new Rect();
		paint = new Paint();
		picture = new Picture(src);
	}
	
	@Override
	protected void onDraw(Canvas canvas) {
		
		player.set(100,100,100,100);
		paint.setColor(Color.RED);
		picture
		canvas.drawPicture(picture, dst);
	}
}
