package unal.todosalau.ejemploframlayouts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.widget.Button;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {

@Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    ImageView imageView = findViewById(R.id.imagen);
    Button button = findViewById(R.id.buttom);

    button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            AnimationSet animationSet = new AnimationSet(true);
            animationSet.addAnimation(new ScaleAnimation(0.5f, 1.5f, 0.5f, 1.5f));
            animationSet.addAnimation(new RotateAnimation(0, 360, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f));
            animationSet.setDuration(1000);
            animationSet.setInterpolator(new AccelerateDecelerateInterpolator());

            imageView.startAnimation(animationSet);
        }
    });
    }
}