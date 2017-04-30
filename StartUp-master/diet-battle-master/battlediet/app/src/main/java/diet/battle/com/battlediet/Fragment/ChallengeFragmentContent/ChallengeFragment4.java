package diet.battle.com.battlediet.Fragment.ChallengeFragmentContent;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import diet.battle.com.battlediet.R;


public class ChallengeFragment4 extends Fragment {

    public ChallengeFragment4() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView=inflater.inflate(R.layout.fragment_challenge4, container, false);


        return rootView;
    }


}
