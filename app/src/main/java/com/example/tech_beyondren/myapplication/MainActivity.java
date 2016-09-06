package com.example.tech_beyondren.myapplication;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView img = (ImageView) findViewById(R.id.robot_shrug);
        Drawable drawable = img.getDrawable();
        Log.i("tag" , "rady");
        if (drawable instanceof Animatable){
            Log.i("tag" , "yes");
            ((Animatable) drawable).start();
        }

    }
}
