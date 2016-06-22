package com.xinran.qxdadian;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

import com.xinran.qxdadian.base.QxBaseActivity;
import com.xinran.qxdadian.base.QxBaseFragment;
import com.xinran.qxdadian.base.QxBaseFragmentPagerAdapter;
import com.xinran.qxdadian.base.QxBaseFragmentStatePagerAdapter;
import com.xinran.qxdadian.fragments.FirstFragmentForViewPager;
import com.xinran.qxdadian.fragments.SencondFragmentForViewPager;
import com.xinran.qxdadian.fragments.ThirdFragmentForViewPager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by qixinh on 16/6/16.
 */
public class FragmentsActivity extends QxBaseActivity {
    private ViewPager mViewPager;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragments);
        mViewPager = $(R.id.vp_fragments);
        List<QxBaseFragment> list = getFragments();
        mViewPager.setAdapter(new ViewPagerAdapter(getSupportFragmentManager(), list));
        mViewPager.setOffscreenPageLimit(0);
    }

    private List<QxBaseFragment> getFragments() {
        List<QxBaseFragment> list = new ArrayList<>();
        list.add(new FirstFragmentForViewPager());
        list.add(new SencondFragmentForViewPager());
        list.add(new ThirdFragmentForViewPager());

        return list == null ? Collections.EMPTY_LIST : list;
    }

    private static class ViewPagerAdapter extends QxBaseFragmentPagerAdapter<QxBaseFragment> {

        public ViewPagerAdapter(FragmentManager fm, List<QxBaseFragment> list) {
            super(fm,list);
        }


    }

    private static class ViewStatePagerAdapter extends QxBaseFragmentStatePagerAdapter <QxBaseFragment> {

        public ViewStatePagerAdapter(FragmentManager fm, List<QxBaseFragment> list) {
            super(fm,list);
        }

    }


}
