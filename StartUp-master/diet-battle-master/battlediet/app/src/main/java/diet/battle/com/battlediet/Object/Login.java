package diet.battle.com.battlediet.Object;

/**
 * Created by hongseung-ui on 2017. 4. 29..
 */
import com.google.gson.annotations.SerializedName;
public class Login {
    @SerializedName("status")
    boolean status;
    public Login() {
    }
    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
