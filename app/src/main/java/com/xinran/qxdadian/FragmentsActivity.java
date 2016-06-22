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
        List<Fragment> list = getFragments();
        mViewPager.setAdapter(new ViewPagerAdapter(getSupportFragmentManager(), list));
        mViewPager.setOffscreenPageLimit(0);
    }

    private List<Fragment> getFragments() {
        List<Fragment> list = new ArrayList<>();
        list.add(new FirstFragmentForViewPager());
        list.add(new SencondFragmentForViewPager());
        list.add(new ThirdFragmentForViewPager());

        return list == null ? Collections.EMPTY_LIST : list;
    }

    private static class ViewPagerAdapter extends QxBaseFragmentPagerAdapter {


        List<Fragment> list;

        public ViewPagerAdapter(FragmentManager fm, List<Fragment> list) {
            super(fm);
            this.list = list;
        }

        @Override
        public Fragment getItem(int i) {


            return list == null ? null : list.get(i);
        }


        @Override
        public int getCount() {
            return list == null ? 0 : list.size();
        }
    }

    private static class ViewStatePagerAdapter extends QxBaseFragmentStatePagerAdapter {
        List<Fragment> list;

        public ViewStatePagerAdapter(FragmentManager fm, List<Fragment> list) {
            super(fm);
            this.list = list;
        }

        @Override
        public Fragment getItem(int i) {


            return list == null ? null : list.get(i);
        }


        @Override
        public int getCount() {
            return list == null ? 0 : list.size();
        }

        @Override
        public int getItemPosition(Object object) {
            return PagerAdapter.POSITION_NONE;
        }

        @Override
        public void destroyItem(View container, int position, Object object) {

            super.destroyItem(container, position, object);
        }
    }


}
