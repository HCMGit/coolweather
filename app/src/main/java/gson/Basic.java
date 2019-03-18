package gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 11578 on 2019/3/17.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public String weatherId;
    public Update update;
    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
