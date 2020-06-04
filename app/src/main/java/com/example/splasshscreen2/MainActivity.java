package com.example.splasshscreen2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView tv;
ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        tv=findViewById( R.id.text );
        img=findViewById( R.id.image );
        Animation myanim= AnimationUtils.loadAnimation( this,R.anim.mytransition );
        tv.startAnimation(myanim);
        img.startAnimation(myanim);

        Thread timer= new Thread(){
            public void run(){
                try{
                    sleep( 5000 );
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                finally {
                    //enter here navigation actiovity to start using intent
                    startActivity(new Intent(MainActivity.this,Main2Activity.class));
                }
            }
        };
            timer.start();
    }
}
