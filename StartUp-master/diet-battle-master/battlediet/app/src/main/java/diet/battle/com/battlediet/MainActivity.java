package diet.battle.com.battlediet;

import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnTabSelectListener;

import diet.battle.com.battlediet.Adapter.MainViewPagerAdapter;
import diet.battle.com.battlediet.View.CustomViewPager;

public class MainActivity extends AppCompatActivity {
    CustomViewPager viewPager;
    TextView textViewTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = (CustomViewPager) findViewById(R.id.viewPager);
        textViewTitle = (TextView)findViewById(R.id.titleName);
        viewPager.setPagingEnabled(false);

        BottomBar bottomBar = (BottomBar) findViewById(R.id.bottomBar);
        bottomBar.setOnTabSelectListener(new OnTabSelectListener() {
            @Override
            public void onTabSelected(@IdRes int tabId) {
                if (tabId == R.id.tab_favorites) {
                    viewPager.setCurrentItem(0);
                    textViewTitle.setText("홈");
                }
                else if(tabId == R.id.tab_nearby){
                    viewPager.setCurrentItem(1);

                }
                else if(tabId == R.id.tab_friends){
                    viewPager.setCurrentItem(2);
                    textViewTitle.setText("배틀 페이지");

                }
            }
        });
        MainViewPagerAdapter adapter = new MainViewPagerAdapter(getSupportFragmentManager(), bottomBar.getTabCount());
        viewPager.setAdapter(adapter);
        viewPager.setOffscreenPageLimit(3);
    }
}
