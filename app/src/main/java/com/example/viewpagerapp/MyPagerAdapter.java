package com.example.viewpagerapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.PagerAdapter;

public class MyPagerAdapter extends PagerAdapter {

    private Context mContext;

    public MyPagerAdapter(Context mContext) {
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        CourseModel courseModel = CourseModel.values()[position];
        LayoutInflater inflater = LayoutInflater.from(mContext);
        ViewGroup layout = (ViewGroup) inflater.inflate(courseModel.getmLayoutID(), container, false);
        container.addView(layout);
        return layout;
    }


    @Override
    public int getCount() {
        return CourseModel.values().length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {

        return view == object;

    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        CourseModel customPagerEnum = CourseModel.values()[position];
        return mContext.getString(customPagerEnum.getmTittleID());
    }
}
