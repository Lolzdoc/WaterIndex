package com.example.WaterIndex;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.Window;
import android.app.ActionBar;

/**
 * Created by hansr_000 on 2015-01-20.
 */
public class StartingClass extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.main);
    }
    private void InitApp(){
    }
}