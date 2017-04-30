package diet.battle.com.battlediet.Fragment.BattleFragmentContent.Content;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import diet.battle.com.battlediet.R;
import diet.battle.com.battlediet.Util.SharedPreferenceManager;
import diet.battle.com.battlediet.View.CustomViewPager;


public class BattlePlannerContentSportFragment extends Fragment {
    CustomViewPager customViewPager;
    ImageView btn_arr[] = new ImageView[6];
    SharedPreferenceManager sharedPreferenceManager;
    int i;
    public BattlePlannerContentSportFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_battle_planner_content_sport, container, false);
        return rootView;
    }

}
