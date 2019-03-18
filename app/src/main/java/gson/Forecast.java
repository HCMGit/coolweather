package gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 11578 on 2019/3/17.
 */

public class Forecast {
    public String date;
    @SerializedName("temp")
    public Temperature temperature;
    @SerializedName("cond")
    public More more;
    public class Temperature{
        public String max;
        public String min;
    }
    public class More{
        @SerializedName("txt_d")
        public String info;
    }
}
