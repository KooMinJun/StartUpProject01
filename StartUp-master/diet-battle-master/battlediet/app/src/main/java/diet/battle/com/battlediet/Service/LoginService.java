package diet.battle.com.battlediet.Service;

import diet.battle.com.battlediet.Object.Login;
import retrofit.Callback;
import retrofit.http.POST;
import retrofit.http.Query;

/**
 * Created by hongseung-ui on 2017. 4. 29..
 */

public interface LoginService {
    @POST("/login")
    void login(@Query("uid") String uid, @Query("token") String token, Callback<Login> callback);


    /*
            Define.webserverSender = new WebserverSender("http://iori.kr", "getdramas", "POST");

     */
}