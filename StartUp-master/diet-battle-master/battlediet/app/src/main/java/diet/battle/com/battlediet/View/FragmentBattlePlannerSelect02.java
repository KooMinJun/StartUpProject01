package diet.battle.com.battlediet.View;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import diet.battle.com.battlediet.R;

/**
 * Created by koominjun on 2017. 4. 29..
 */


public class FragmentBattlePlannerSelect02 extends AppCompatActivity implements View.OnClickListener{
    Button btn01;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        setContentView(R.layout.fragment_battle_planner_select01);
        btn01 = (Button)findViewById(R.id.btn01);

        super.onCreate(savedInstanceState);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.img01:
                startActivity(new Intent(FragmentBattlePlannerSelect02.this, FragmentBattlePlannerSelect01.class));
        }
    }
}


