package diet.battle.com.battlediet.Fragment.DashFragmentContent;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import diet.battle.com.battlediet.R;

public class DashBoardTodayFragment extends Fragment {
    static final String[] LIST_MENU = {"줄넘기 100번", "이소라 다이어트 비디오 보기", "물 1리터 먹기", "윗몸 일으키기 100번"} ;

    public DashBoardTodayFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_dash_board_today, container, false);

        ArrayAdapter adapter = new ArrayAdapter(getActivity(), android.R.layout.simple_list_item_1, LIST_MENU) ;

        ListView listview = (ListView) rootView.findViewById(R.id.todolistview) ;
        listview.setAdapter(adapter) ;

        return rootView;
    }

}
