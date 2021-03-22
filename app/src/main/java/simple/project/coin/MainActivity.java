package simple.project.coin;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView coinView = (ImageView) findViewById(R.id.coinView);

        coinView.setBackgroundResource(R.drawable.animation_flip_coin);

        AnimationDrawable animationDrawable = (AnimationDrawable) coinView.getBackground();
        animationDrawable.start();

        Button flipCoinButton = (Button) findViewById(R.id.flipCoinButton);
        flipCoinButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(animationDrawable.isRunning()){
                    animationDrawable.stop();
                }else{
                    animationDrawable.start();
                }
            }
        });

    }
}