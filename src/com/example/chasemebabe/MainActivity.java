package com.example.chasemebabe;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Point;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Point screenDimention = new Point();
        setContentView(new MainPanel(this, screenDimention));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}
