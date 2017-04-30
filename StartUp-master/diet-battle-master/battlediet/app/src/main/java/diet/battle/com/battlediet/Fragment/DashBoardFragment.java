package diet.battle.com.battlediet.Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.astuetz.PagerSlidingTabStrip;

import diet.battle.com.battlediet.Adapter.DashBoardViewPagerAdapter;
import diet.battle.com.battlediet.R;
import diet.battle.com.battlediet.View.CustomViewPager;

public class DashBoardFragment extends Fragment {


    CustomViewPager customViewPager;
    public DashBoardFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_dash_board, container, false);

        customViewPager = (CustomViewPager) v.findViewById(R.id.dash_board_viewpager);

        customViewPager.setPagingEnabled(false);

        customViewPager.setAdapter(new DashBoardViewPagerAdapter(getChildFragmentManager()));
        PagerSlidingTabStrip tabs = (PagerSlidingTabStrip) v.findViewById(R.id.dash_board_tabs);
        tabs.setViewPager(customViewPager);
        return v;
    }


}
