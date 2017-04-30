package diet.battle.com.battlediet.Util;

/**
 * Created by hongseung-ui on 2017. 4. 30..
 */

import retrofit.RestAdapter;

public class RetrofitUtil {

    private static RestAdapter adapter;

    public static RestAdapter getAdapter() {
        if (null == adapter) {
            adapter = new RestAdapter.Builder()
                    .setEndpoint("http://battlediet.jtjsoft.com")
                    .build();
        }

        return adapter;
    }
}
