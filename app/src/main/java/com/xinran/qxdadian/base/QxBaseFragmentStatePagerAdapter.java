package com.xinran.qxdadian.base;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.util.Log;
import android.view.ViewGroup;


/**
 * Created by qixinh on 16/6/22.
 */
public abstract class QxBaseFragmentStatePagerAdapter extends FragmentStatePagerAdapter {

    protected int cur = -1;

    public QxBaseFragmentStatePagerAdapter(FragmentManager fm) {
        super(fm);
    }


    @Override
    public void setPrimaryItem(ViewGroup container, int position, Object object) {
        super.setPrimaryItem(container, position, object);
        if (cur != position) {
            Log.e("NB", "position" + position);
            cur = position;
        }

    }

}