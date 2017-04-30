package diet.battle.com.battlediet.Fragment.ChallengeFragmentContent;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import diet.battle.com.battlediet.R;


public class ChallengeFragment1 extends Fragment {

    public ChallengeFragment1() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_challenge1, container, false);

        Button btn = (Button) rootView.findViewById(R.id.btn_challenge01);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((ViewPager) (getActivity().findViewById(R.id.challenge_viewpager))).setCurrentItem(1);
            }
        });
        return rootView;
    }


}
