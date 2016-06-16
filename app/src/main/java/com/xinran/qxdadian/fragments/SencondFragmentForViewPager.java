package com.xinran.qxdadian.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.xinran.qxdadian.R;
import com.xinran.qxdadian.base.QxBaseFragmentForViewPager;

/**
 * Created by qixinh on 16/6/15.
 */
public class SencondFragmentForViewPager extends QxBaseFragmentForViewPager {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_second, container, false);
    }
}
