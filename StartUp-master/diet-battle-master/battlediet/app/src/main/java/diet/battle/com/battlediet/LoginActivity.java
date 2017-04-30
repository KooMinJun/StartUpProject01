package diet.battle.com.battlediet;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

import com.facebook.CallbackManager;
import com.facebook.login.widget.LoginButton;
/**
 * Created by koominjun on 2017. four. 29..
 */

public class LoginActivity extends Activity implements View.OnClickListener {
    Button login;
    CallbackManager callbackManager;
    LoginButton loginButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

//        String userId = SharedPreferenceManager.getSharedPreference(getApplicationContext(),"userId");
//        if(userId!=null){
//            startActivityCustom();
//            finish();
//        }
        login = (Button)findViewById(R.id.login);

        login.setOnClickListener(this);

//        callbackManager = CallbackManager.Factory.create();
//        loginButton = (LoginButton) findViewById(R.id.login_button);
//        loginButton.setReadPermissions("email");
//        loginButton.registerCallback(callbackManager, new FacebookCallback<LoginResult>() {
//
//            @Override
//            public void onSuccess(LoginResult loginResult) {
//                AccessTokenTracker accessTokenTracker = new AccessTokenTracker() {
//                    @Override
//                    protected void onCurrentAccessTokenChanged(
//                            AccessToken oldAccessToken,
//                            AccessToken currentAccessToken) {
//                        // Set the access token using
//                        // currentAccessToken when it's loaded or set.
//                    }
//                };
//                // If the access token is available already assign it.
//                final AccessToken accessToken = AccessToken.getCurrentAccessToken();
//                Log.d("sibal" ,"applicationId : " + accessToken.getApplicationId()+ " accessToken : "+ accessToken.getToken()+ " UserId :  "+accessToken.getUserId());
//                LoginService loginService = RetrofitUtil.getAdapter().create(LoginService.class);
//                loginService.login(accessToken.getUserId(),accessToken.getToken(),new Callback<Login>() {
//                    @Override
//                    public void success(Login login, Response response) {
//                        Log.e("sibal",login.isStatus()+" ");
//
//                        startActivityCustom();
//
//                        SharedPreferenceManager.putSharedPreference(getApplicationContext(),"userId",accessToken.getUserId());
//                    }
//                    @Override
//                    public void failure(RetrofitError error) {
//                        Log.e("sibal", "Error : " + error.getMessage());
//                    }
//                });
//            }
//            @Override
//            public void onCancel() {
//
//            }
//
//            @Override
//            public void onError(FacebookException error) {
//
//            }
//
//        });


    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.login){
            startActivity(new Intent(LoginActivity.this, MainActivity.class));
        }
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        callbackManager.onActivityResult(requestCode, resultCode, data);
    }
    public void startActivityCustom(){
        startActivity(new Intent(LoginActivity.this, MainActivity.class));
    }
}
