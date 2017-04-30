package diet.battle.com.battlediet.Fragment.BattleFragmentContent;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import diet.battle.com.battlediet.R;
import diet.battle.com.battlediet.View.CustomViewPager;

/**
 * Created by koominjun on 2017. 4. 30..
 */

public class BattlePlannerStart extends Fragment implements View.OnClickListener {
    ImageView imageView;
    int i;
    CustomViewPager customViewPager;

    public BattlePlannerStart() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_start_schedule, container, false);
        imageView = (ImageView)rootView.findViewById(R.id.click_schedule);
        customViewPager = (CustomViewPager) getActivity().findViewById(R.id.battle_planner_viewpager);
        imageView.setOnClickListener(this);

        return rootView;
    }

    @Override
    public void onClick(View v) {
        customViewPager.setCurrentItem(1);
    }
}
