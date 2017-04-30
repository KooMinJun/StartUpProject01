package diet.battle.com.battlediet.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import diet.battle.com.battlediet.Fragment.DashFragmentContent.DashBoardNowChangeFragment;
import diet.battle.com.battlediet.Fragment.DashFragmentContent.DashBoardTodayFragment;

/**
 * Created by hongseung-ui on 2017. four. 29..
 */

public class DashBoardViewPagerAdapter extends FragmentStatePagerAdapter {
    FragmentManager fm;
    public Fragment fragmentFirst;
    String []str = {"오늘 할 일", "현재 체중 변화"};
    public DashBoardViewPagerAdapter(FragmentManager fm) {
        super(fm);
        this.fm=fm;
    }

    @Override
    public Fragment getItem(int position)
    {
        switch (position) {
            case 0:
                DashBoardTodayFragment tab1 = new DashBoardTodayFragment();
                return tab1;
            case 1:
                DashBoardNowChangeFragment tab2 = new DashBoardNowChangeFragment();
                return tab2;
            default:
                return null;
        }
    }
    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return str[position];
    }

    @Override
    public int getItemPosition(Object object)
    {
        return POSITION_UNCHANGED;
    }

}
