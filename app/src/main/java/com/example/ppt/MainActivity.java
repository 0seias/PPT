package com.example.ppt;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView garrafa;
    Button btGarrafa;
    Random r;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btGarrafa = (Button) findViewById(R.id.btGarrafa);
        garrafa = (ImageView) findViewById(R.id.mao);
        r = new Random();

        btGarrafa.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                RotateAnimation roda = new RotateAnimation(0, r.nextInt()+360,
                        RotateAnimation.RELATIVE_TO_SELF,.5f, RotateAnimation.RELATIVE_TO_SELF, .5f);
                roda.setFillAfter(true);
                roda.setDuration(200);
                roda.setRepeatCount(10);
                garrafa.startAnimation(roda);
            }
        });
    }
}