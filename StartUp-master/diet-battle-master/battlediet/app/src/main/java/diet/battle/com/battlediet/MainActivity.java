package diet.battle.com.battlediet;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import diet.battle.com.battlediet.View.CustomViewPager;

public class MainActivity extends AppCompatActivity {
    CustomViewPager viewPager;
    TextView textViewTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}
