package diet.battle.com.battlediet.View;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import diet.battle.com.battlediet.R;

/**
 * Created by koominjun on 2017. 4. 29..
 */

public class FragmentBattlePlannerSelect01 extends AppCompatActivity implements View.OnClickListener{
    ImageView img01, img02, img03, img04, img05, img06;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        setContentView(R.layout.fragment_battle_planner_select01);
        img01 = (ImageView)findViewById(R.id.img01);

        super.onCreate(savedInstanceState);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.img01:
                startActivity(new Intent(FragmentBattlePlannerSelect01.this, FragmentBattlePlannerSelect02.class));
        }
    }
}


