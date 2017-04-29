package diet.battle.com.battlediet;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import diet.battle.com.battlediet.Adapter.MainViewPagerAdapter;
import diet.battle.com.battlediet.View.CustomViewPager;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    CustomViewPager viewPager;
    TextView textViewTitle;
    LinearLayout btnHome,btnBattlePlanner;
    Button btnBattle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = (CustomViewPager) findViewById(R.id.viewPager);
        textViewTitle = (TextView)findViewById(R.id.titleName);
        viewPager.setPagingEnabled(false);

        btnHome=(LinearLayout)findViewById(R.id.btn_home);
        btnBattlePlanner=(LinearLayout)findViewById(R.id.btn_battle_planner);
        btnBattle=(Button)findViewById(R.id.btn_battle);


        MainViewPagerAdapter adapter = new MainViewPagerAdapter(getSupportFragmentManager(),3);
        viewPager.setAdapter(adapter);
        viewPager.setOffscreenPageLimit(3);

        btnBattle.setOnClickListener(this);
        btnBattlePlanner.setOnClickListener(this);
        btnHome.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v==btnHome){
            viewPager.setCurrentItem(0);
            textViewTitle.setText("홈");

        }
        if(v==btnBattlePlanner){
            viewPager.setCurrentItem(2);
            textViewTitle.setText("배틀 플래너");

        }
        if(v==btnBattle){
            viewPager.setCurrentItem(1);
            textViewTitle.setText("배틀 페이지");

        }
    }
}
