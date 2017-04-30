package diet.battle.com.battlediet;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.rd.PageIndicatorView;

import diet.battle.com.battlediet.Adapter.ChallengeViewPagerAdapter;

/**
 * Created by hongseung-ui on 2017. 4. 30..
 */

public class ChallengeActivity extends AppCompatActivity {
    ViewPager viewPager;
    PageIndicatorView pageIndicatorView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_challenge);
        ChallengeViewPagerAdapter adapter = new ChallengeViewPagerAdapter(getSupportFragmentManager());
        pageIndicatorView=(PageIndicatorView)findViewById(R.id.pageIndicatorView);
        viewPager=(ViewPager)findViewById(R.id.challenge_viewpager);
        viewPager.setAdapter(adapter);
        viewPager.setOffscreenPageLimit(3);

        pageIndicatorView.setViewPager(viewPager);

    }
}
