package com.example.viewpagerapp;

public enum CourseModel {
    RED(R.string.red,R.layout.view_red),
    BLUE(R.string.blue,R.layout.view_blue),
    GREEN(R.string.green,R.layout.view_green);
    private int mTittleID;
    private int mLayoutID;

    CourseModel(int mTittleID, int mLayoutID) {
        this.mTittleID = mTittleID;
        this.mLayoutID = mLayoutID;
    }

    public int getmTittleID() {
        return mTittleID;
    }

    public int getmLayoutID() {
        return mLayoutID;
    }
}
