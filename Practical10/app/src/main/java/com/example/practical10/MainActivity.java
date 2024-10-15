package com.example.practical10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) { super.onCreate(savedInstanceState); setContentView(R.layout.activity_main);

        final ImageView imageView = findViewById(R.id.imageView); Button animateButton = findViewById(R.id.animateButton);
        final Animation fadeInAnimation = AnimationUtils.loadAnimation(this, R.anim.fade_in); fadeInAnimation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {}

            @Override
            public void onAnimationEnd(Animation animation) {
            }

            @Override
            public void onAnimationRepeat(Animation animation) {}
        });

        animateButton.setOnClickListener(new View.OnClickListener() { @Override
        public void onClick(View view) { imageView.startAnimation(fadeInAnimation);
        }
        });

        Button animateButton2 = findViewById(R.id.animateButton2);
        final Animation rotateAnimation = AnimationUtils.loadAnimation(this, R.anim.rotate);

        rotateAnimation.setAnimationListener(new Animation.AnimationListener() { @Override
        public void onAnimationStart(Animation animation) {} @Override


        public void onAnimationEnd(Animation animation) {
        }


        });

        @Override
        public void onAnimationRepeat(Animation animation) {}


        animateButton2.setOnClickListener(new View.OnClickListener() { @Override
        public void onClick(View view) { imageView.startAnimation(rotateAnimation);
        }
        });
    }
}
