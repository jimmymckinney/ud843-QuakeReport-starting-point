package com.example.android.quakereport;

public class Earthquake {

    private double mMagnitude;
    private String mPlace;
    private String mDate;
    private String mTime;
    private String mOffsetLocation;
    private String mPrimaryLocation;
    private String mUrl;

    public Earthquake (double magnitude, String place, String date, String time, String url) {
        mMagnitude = magnitude;
        mPlace = place;
        mDate = date;
        mTime = time;
        mUrl = url;

        if (place.contains("of")) {
            String[] location = place.split("(?<=of )");
            mOffsetLocation = location[0];
            mPrimaryLocation = location[1];
        }
        else {
            mOffsetLocation = "Near the";
            mPrimaryLocation = place;
        }
    }

    public double getMagnitude() {
        return mMagnitude;
    }

    public String getPlace() {
        return mPlace;
    }

    public String getDate() {
        return mDate;
    }

    public String getTime() {
        return mTime;
    }

    public String getOffsetLocation() {
        return mOffsetLocation;
    }

    public String getPrimaryLocation() {
        return mPrimaryLocation;
    }

    public String getUrl(){return mUrl;}

}
