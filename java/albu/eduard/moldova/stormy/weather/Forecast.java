package albu.eduard.moldova.stormy.weather;

import albu.eduard.moldova.stormy.R;

/**
 * Created by Eduard Albu on 27.06.2015.
 */
public class Forecast {
    private Current mCurrent;
    private Hour[] mHourlyForecast;
    private Day[] mDaylyForecast;

    public Current getCurrent() {
        return mCurrent;
    }

    public void setCurrent(Current current) {
        mCurrent = current;
    }

    public Hour[] getHourlyForecast() {
        return mHourlyForecast;
    }

    public void setHourlyForecast(Hour[] hourlyForecast) {
        mHourlyForecast = hourlyForecast;
    }

    public Day[] getDailyForecast() {
        return mDaylyForecast;
    }

    public void setDailyForecast(Day[] daylyForecast) {
        mDaylyForecast = daylyForecast;
    }

    public static int getIconId(String iconString) {

        int iconId = R.mipmap.clear_day;

        if (iconString.equals("clear-day")){
            iconId = R.mipmap.clear_day;
        } else if (iconString.equals("clear-night")) {
            iconId = R.mipmap.clear_night;
        } else if (iconString.equals("rain")) {
            iconId = R.mipmap.rain;
        } else if (iconString.equals("snow")) {
            iconId = R.mipmap.snow;
        } else if (iconString.equals("sleet")) {
            iconId = R.mipmap.sleet;
        } else if (iconString.equals("wind")) {
            iconId = R.mipmap.wind;
        } else if (iconString.equals("fog")) {
            iconId = R.mipmap.fog;
        } else if (iconString.equals("cloudy")) {
            iconId = R.mipmap.cloudy;
        } else if (iconString.equals("partly-cloudy-day")) {
            iconId = R.mipmap.partly_cloudy;
        } else if (iconString.equals("partly-cloudy-night")) {
            iconId = R.mipmap.cloudy_night;
        }
        return iconId;
    }

}
