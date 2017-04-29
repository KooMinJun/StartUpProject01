package diet.battle.com.battlediet.View;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

import diet.battle.com.battlediet.MainActivity;
import diet.battle.com.battlediet.R;

/**
 * Created by koominjun on 2017. 4. 29..
 */

public class LoginActivity extends Activity implements View.OnClickListener {
    Button login;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        login = (Button)findViewById(R.id.login);

        login.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.login){
            startActivity(new Intent(LoginActivity.this, MainActivity.class));
        }
    }
}
