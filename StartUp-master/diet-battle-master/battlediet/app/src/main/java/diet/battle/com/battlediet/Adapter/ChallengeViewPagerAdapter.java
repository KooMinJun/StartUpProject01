package diet.battle.com.battlediet.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import diet.battle.com.battlediet.Fragment.BattleFragment;
import diet.battle.com.battlediet.Fragment.BattlePlannerFragment;
import diet.battle.com.battlediet.Fragment.ChallengeFragmentContent.ChallengeFragment1;
import diet.battle.com.battlediet.Fragment.ChallengeFragmentContent.ChallengeFragment2;
import diet.battle.com.battlediet.Fragment.ChallengeFragmentContent.ChallengeFragment3;
import diet.battle.com.battlediet.Fragment.ChallengeFragmentContent.ChallengeFragment4;
import diet.battle.com.battlediet.Fragment.DashBoardFragment;

/**
 * Created by hongseung-ui on 2017. 4. 29..
 */

public class ChallengeViewPagerAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    FragmentManager fm;
    public Fragment fragmentFirst;
    public ChallengeViewPagerAdapter(FragmentManager fm) {
        super(fm);
        this.fm=fm;
    }

    @Override
    public Fragment getItem(int position)
    {
        switch (position) {
            case 0:
                return new ChallengeFragment1();
            case 1:
                return new ChallengeFragment2();

            case 2:
                return new ChallengeFragment3();

            case 3:
                return new ChallengeFragment4();

            default:
                return null;
        }
    }
    @Override
    public int getCount() {
        return 4;
    }
    @Override
    public int getItemPosition(Object object)
    {
        return POSITION_UNCHANGED;
    }

}
