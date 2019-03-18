package gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by 11578 on 2019/3/17.
 */

public class Weather {
    public String status;
    public Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;
    @SerializedName("daily_forecast")
    public List<Forecast>forecastsList;
}
