package com.xinran.qxdadian.base;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.util.Log;
import android.view.ViewGroup;

import java.util.List;


/**
 * Created by qixinh on 16/6/22.
 */
public class QxBaseFragmentPagerAdapter<E extends Fragment> extends FragmentPagerAdapter {

    private int cur = -1;
    protected List<E> mList;

    public QxBaseFragmentPagerAdapter(FragmentManager fm, List<E> list) {
        super(fm);
        this.mList = list;
    }

    protected void setData(List<E> list) {
        mList.addAll(list);
        notifyDataSetChanged();
    }

    @Override
    public void setPrimaryItem(ViewGroup container, int position, Object object) {
        super.setPrimaryItem(container, position, object);
        if (cur != position) {//因为会连续重复多次
            if (cur != -1) {
                Log.e("NB", "Pre_position:==" + cur + " ClassName:==" + mList.get(cur).getClass().getSimpleName());
            }
            Log.e("NB", "Cur_position:==" + position + " ClassName:==" + object.getClass().getSimpleName());
            cur = position;
        }

    }

    @Override
    public E getItem(int i) {
        return mList == null ? null : mList.get(i);
    }


    @Override
    public int getCount() {
        return mList == null ? 0 : mList.size();
    }
}