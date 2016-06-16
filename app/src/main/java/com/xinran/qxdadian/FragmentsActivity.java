package com.xinran.qxdadian;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;

import com.xinran.qxdadian.base.QxBaseActivity;
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
//        mViewPager.setCurrentItem(0);
//设置缓存page的个数 2*n+1;
        mViewPager.setOffscreenPageLimit(0);
    }

    private List<Fragment> getFragments() {
        List<Fragment> list = new ArrayList<>();
        list.add(new FirstFragmentForViewPager());
        list.add(new SencondFragmentForViewPager());
        list.add(new ThirdFragmentForViewPager());

        return list == null ? Collections.EMPTY_LIST : list;
    }

    private static class ViewPagerAdapter extends FragmentStatePagerAdapter {
        List<Fragment> list;
//        private boolean isFirstVisible = true;
//        private String mPrefragmentName = "";
//        private boolean isFirstlog = true;


        public ViewPagerAdapter(FragmentManager fm, List<Fragment> list) {
            super(fm);
            this.list = list;
        }

        @Override
        public Fragment getItem(int i) {
//            int pre=i==0?list.size()-1:i-1;
//            int next=i==list.size()-1?0:i+1;
//            if (isFirstVisible) {
//                isFirstVisible = false;
//            } else {
//                if (isFirstlog) {
//                    isFirstlog = false;
//                } else {
//
//                }
//                Log.e("Pid", "from:" + getPreFragmentName() + "; to:" + list.get(i).getClass().getSimpleName());
//                setPreFragmentName(list.get(i).getClass().getSimpleName());
//            }

            return list == null ? null : list.get(i);
        }

//        private void setPreFragmentName(String simpleName) {
//            mPrefragmentName = simpleName;
//        }
//
//        private String getPreFragmentName() {
//            return mPrefragmentName;
//        }

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
//            Fragment frag=list.get(position);
//            FragmentManager manager = frag.getFragmentManager();
//            FragmentTransaction trans = manager.beginTransaction();
//            trans.remove(frag);
//            trans.commit();
            super.destroyItem(container, position, object);
        }
    }


}
