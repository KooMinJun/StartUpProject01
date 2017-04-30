package diet.battle.com.battlediet.Fragment.DashFragmentContent;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import diet.battle.com.battlediet.R;

public class DashBoardNowChangeFragment extends Fragment {
    static final String[] LIST_MENU = {"줄넘기 100번", "이소라 다이어트 비디오 보기", "물 1리터 먹기", "윗몸 일으키기 100번"} ;

    public DashBoardNowChangeFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_dash_board_now_change, container, false);

        ImageView imageView = (ImageView)rootView.findViewById(R.id.chart) ;

        return rootView;
    }

}
