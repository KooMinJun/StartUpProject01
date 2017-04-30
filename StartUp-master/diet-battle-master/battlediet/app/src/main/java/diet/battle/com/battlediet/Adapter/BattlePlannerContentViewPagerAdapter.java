package diet.battle.com.battlediet.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import diet.battle.com.battlediet.Fragment.BattleFragmentContent.Content.BattlePlannerContentFoodFragment;
import diet.battle.com.battlediet.Fragment.BattleFragmentContent.Content.BattlePlannerContentSportFragment;
import diet.battle.com.battlediet.Fragment.BattleFragmentContent.Content.BattlePlannerContentTodayFragment;

/**
 * Created by hongseung-ui on 2017. four. 29..
 */

public class BattlePlannerContentViewPagerAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    private final String[] TITLES = { "추천운동","추천식당","오늘할일" };
    FragmentManager fm;
    public Fragment fragmentFirst;
    public BattlePlannerContentViewPagerAdapter(FragmentManager fm) {
        super(fm);
        this.fm=fm;
    }

    @Override
    public Fragment getItem(int position)
    {
        switch (position) {
            case 0:
                return new BattlePlannerContentSportFragment();
            case 1:
                return new BattlePlannerContentFoodFragment();
            case 2:
                return new BattlePlannerContentTodayFragment();
            default:
                return null;
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return TITLES[position];
    }

    @Override
    public int getCount() {
        return 3;
    }
    @Override
    public int getItemPosition(Object object)
    {
        return POSITION_UNCHANGED;
    }

}
