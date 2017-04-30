package diet.battle.com.battlediet.Fragment.BattleFragmentContent;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import diet.battle.com.battlediet.LoadingActivity;
import diet.battle.com.battlediet.R;
import diet.battle.com.battlediet.Util.SharedPreferenceManager;
import diet.battle.com.battlediet.View.CustomViewPager;

public class BattlePlannerPartSelectFragment extends Fragment {

    CustomViewPager customViewPager;
    ImageView btn_arr[] = new ImageView[6];
    SharedPreferenceManager sharedPreferenceManager;
    int i;
    public BattlePlannerPartSelectFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_battle_planner_part_select, container, false);


        customViewPager = (CustomViewPager) getActivity().findViewById(R.id.battle_planner_viewpager);
        btn_arr[0] = (ImageView) rootView.findViewById(R.id.img01);
        btn_arr[1] = (ImageView) rootView.findViewById(R.id.img02);
        btn_arr[2] = (ImageView) rootView.findViewById(R.id.img03);
        btn_arr[3] = (ImageView) rootView.findViewById(R.id.img04);
        btn_arr[4] = (ImageView) rootView.findViewById(R.id.img05);
        btn_arr[5] = (ImageView) rootView.findViewById(R.id.img06);

        for(i=0;i<6;i++){
            btn_arr[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(getContext(), LoadingActivity.class));
                    customViewPager.setCurrentItem(2);
                    sharedPreferenceManager.putSharedPreference(getContext(),"PartSelect",i);

                }
            });
        }

        return rootView;
    }

}
