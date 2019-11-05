package com.example.quizapp;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class MyCanvas extends View {
Paint paint;
Path path;


    public MyCanvas(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
paint = new Paint();
path = new Path();
paint.setAntiAlias(true);
paint.setColor(Color.BLUE);

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

    }
}
