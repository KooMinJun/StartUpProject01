package diet.battle.com.battlediet.Fragment.BattleFragmentContent;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.astuetz.PagerSlidingTabStrip;

import diet.battle.com.battlediet.Adapter.BattlePlannerContentViewPagerAdapter;
import diet.battle.com.battlediet.R;
import diet.battle.com.battlediet.View.CustomViewPager;


// 배틀 플래너 - 네번째 페이지(세팅화면 말구)
public class BattlePlannerContentFragment extends Fragment {

    CustomViewPager customViewPager;
    public BattlePlannerContentFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_battle_planner_content, container, false);

        customViewPager= (CustomViewPager)rootView.findViewById(R.id.battle_planner_content_viewpager);
        customViewPager.setAdapter(new BattlePlannerContentViewPagerAdapter(getChildFragmentManager()));

        PagerSlidingTabStrip tabs = (PagerSlidingTabStrip) rootView.findViewById(R.id.tabs);

        tabs.setViewPager(customViewPager);

        return rootView;
    }

}
