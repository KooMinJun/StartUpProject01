package diet.battle.com.battlediet.Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ListView;

import java.util.ArrayList;

import diet.battle.com.battlediet.Adapter.CustomBaseAdapter;
import diet.battle.com.battlediet.R;
import diet.battle.com.battlediet.View.CustomViewPager;


public class BattleFragment extends Fragment {
    CardView cardView;
    ListView listView;
    public BattleFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView=inflater.inflate(R.layout.fragment_battle, container, false);
        cardView = (CardView)rootView.findViewById(R.id.my_profile);
        CustomViewPager viewPager=((CustomViewPager)(getActivity().findViewById(R.id.viewPager)));
        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                if (position==1){
                    Animation animation = AnimationUtils.loadAnimation(getContext(), R.anim.battlelist);
                    cardView.startAnimation(animation);
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        ArrayList<String> arr=new ArrayList<>();
        arr.add("구민준");
        arr.add("홍승의");
        arr.add("김덕수");
        arr.add("구준표");
        arr.add("장태진");
        arr.add("권광현");
        arr.add("윤진영");
        arr.add("이예닮");
        arr.add("예수님");
        CustomBaseAdapter customBaseAdapter=new CustomBaseAdapter(getContext(),arr);

        listView = (ListView)rootView.findViewById(R.id.friendList);
        listView.setAdapter(customBaseAdapter);
        return rootView;
    }


}
