package cn.com.xiaowenhan.pfmstartactivity;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;

public class SecondActivity extends Activity {

    private final String TAG = getClass().getSimpleName();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.d(TAG, "onCreate end");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart end");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume end");
    }
}
