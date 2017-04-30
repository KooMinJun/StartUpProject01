package diet.battle.com.battlediet.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import diet.battle.com.battlediet.Fragment.BattleFragmentContent.BattlePlannerContentFragment;
import diet.battle.com.battlediet.Fragment.BattleFragmentContent.BattlePlannerPartSelectFragment;
import diet.battle.com.battlediet.Fragment.BattleFragmentContent.BattlePlannerStart;

/**
 * Created by hongseung-ui on 2017. four. 29..
 */

public class BattlePlannerViewPagerAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    FragmentManager fm;
    public Fragment fragmentFirst;
    public BattlePlannerViewPagerAdapter(FragmentManager fm) {
        super(fm);
        this.fm=fm;
    }

    @Override
    public Fragment getItem(int position)
    {
        switch (position) {
            case 1:
                BattlePlannerPartSelectFragment tab1 = new BattlePlannerPartSelectFragment();
                return tab1;
            case 2:
                BattlePlannerContentFragment tab4= new BattlePlannerContentFragment();
                return tab4;
            case 0:
                return new BattlePlannerStart();
            default:
                return null;
        }
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
