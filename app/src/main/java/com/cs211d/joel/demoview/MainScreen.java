package com.cs211d.joel.demoview;

import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class MainScreen extends ActionBarActivity
{
    DemoView dv;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        dv = new DemoView(this);
        dv.setBackgroundColor(Color.WHITE);
        setContentView(dv);
    }


}
