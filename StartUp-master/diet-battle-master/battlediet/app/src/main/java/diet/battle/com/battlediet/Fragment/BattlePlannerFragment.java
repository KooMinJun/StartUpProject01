package diet.battle.com.battlediet.Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import diet.battle.com.battlediet.Adapter.BattlePlannerViewPagerAdapter;
import diet.battle.com.battlediet.R;
import diet.battle.com.battlediet.View.CustomViewPager;


public class BattlePlannerFragment extends Fragment {
    CustomViewPager viewPager;

    public BattlePlannerFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView=inflater.inflate(R.layout.fragment_battle_planner, container, false);
        viewPager = (CustomViewPager) rootView.findViewById(R.id.battle_planner_viewpager);
        viewPager.setPagingEnabled(false);


        BattlePlannerViewPagerAdapter adapter = new BattlePlannerViewPagerAdapter(getChildFragmentManager());
        viewPager.setAdapter(adapter);
        viewPager.setOffscreenPageLimit(3);
        return rootView;
    }

}
