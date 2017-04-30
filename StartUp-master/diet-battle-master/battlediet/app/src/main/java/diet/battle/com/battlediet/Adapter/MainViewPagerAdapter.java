package diet.battle.com.battlediet.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import diet.battle.com.battlediet.Fragment.BattleFragment;
import diet.battle.com.battlediet.Fragment.BattlePlannerFragment;
import diet.battle.com.battlediet.Fragment.DashBoardFragment;

/**
 * Created by hongseung-ui on 2017. four. 29..
 */

public class MainViewPagerAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    FragmentManager fm;
    public Fragment fragmentFirst;
    public MainViewPagerAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.fm=fm;
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position)
    {
        switch (position) {
            case 0:
                DashBoardFragment tab1 = new DashBoardFragment();
                return tab1;
            case 1:
                BattleFragment tab2 = new BattleFragment();
                return tab2;
            case 2:
                BattlePlannerFragment tab3 = new BattlePlannerFragment();
                return tab3;
            default:
                return null;
        }
    }
    @Override
    public int getCount() {
        return mNumOfTabs;
    }
    @Override
    public int getItemPosition(Object object)
    {
        return POSITION_UNCHANGED;
    }

}
