package cn.com.xiaowenhan.pfmstartactivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private final String TAG = getClass().getSimpleName();

    private Button launchFirstBtn, launchSecondBtn;

    private boolean needSleep;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        launchFirstBtn = findViewById(R.id.activity_main_launch_first_btn);
        launchSecondBtn = findViewById(R.id.activity_main_launch_second_btn);
        launchFirstBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                needSleep = false;
                startActivity(new Intent(MainActivity.this, FirstActivity.class));
                Log.d(TAG, "Launch FirstActivity clicked!");
            }
        });
        launchSecondBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                needSleep = true;
                startActivity(new Intent(MainActivity.this, SecondActivity.class));
                Log.d(TAG, "Launch SecondActivity clicked!");
            }
        });
    }

    @Override
    protected void onPause() {
        super.onPause();
        sleep();
    }

    // Sleep 5000 ms in main thread.
    private void sleep() {
        if (needSleep) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
