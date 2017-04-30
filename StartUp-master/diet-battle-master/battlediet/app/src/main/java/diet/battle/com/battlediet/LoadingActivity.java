package diet.battle.com.battlediet;

import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.wang.avi.AVLoadingIndicatorView;

/**
 * Created by hongseung-ui on 2017. 4. 30..
 */

public class LoadingActivity extends AppCompatActivity {
    AVLoadingIndicatorView indicatorView;
    Runnable runnable;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading);

        runnable= new Runnable() {
            @Override
            public void run() {
                finish();
            }
        };
        Handler handler=new Handler();
        handler.postDelayed(runnable,5000);
        indicatorView=(AVLoadingIndicatorView) findViewById(R.id.avi);

        indicatorView.show();

    }
}
