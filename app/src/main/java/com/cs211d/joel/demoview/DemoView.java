package com.cs211d.joel.demoview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;


public class DemoView extends View
{
    Paint p = new Paint();

    public DemoView(Context context)
    {
        super(context);
        p.setColor(Color.YELLOW);
    }

    public void onDraw(Canvas c)
    {
        Rect rect = new Rect();
        rect.set(0, 0, c.getWidth(), c.getHeight() / 2);
        Paint blue = new Paint();
        blue.setColor(Color.BLUE);
        blue.setStyle(Paint.Style.FILL);
        c.drawLine(500, 33, 20, 20, p);
        c.drawLine(20, 88, 30, 20, p);
        c.drawRect(rect, blue);
        c.drawCircle(c.getWidth() / 2, 0, c.getHeight()/2,p);
    }

}
