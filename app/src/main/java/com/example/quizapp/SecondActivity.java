package com.example.quizapp;

import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {
    Button b;


    PaintView paintArea;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        b = findViewById(R.id.butt);


        paintArea = new PaintView(this);
        setContentView(paintArea);
        paintArea.requestFocus();
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Main3Activity.class);
                startActivity(intent);
            }
        });
    }

    public class PaintView extends View implements View.OnTouchListener {

        List<Point> points = new ArrayList<Point>();
        Paint paint = new Paint();

        public PaintView(Context context) {
            super(context);
            setFocusable(true);
            setFocusableInTouchMode(true);

            this.setOnTouchListener(this);
            paint.setColor(Color.RED);
            //You can use spinner to choose color.
            paint.setAntiAlias(true);
            paint.setStrokeWidth(16f);
            //setStrokeWidth to change thickness of paint line.
        }

        @Override
        public void onDraw(Canvas canvas) {
            for (Point point : points) {
                canvas.drawCircle(point.x, point.y, 5, paint);
            }
        }
        public boolean onTouch(View view, MotionEvent event) {
            Point dot = new Point();
            dot.x = event.getX();
            dot.y = event.getY();
            points.add(dot);
            invalidate();
            return true;
        }
    }

    class Point {
        float x, y;

        @Override
        public String toString() {
            return x + ", " + y;
        }
    }

}
