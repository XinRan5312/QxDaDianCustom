package com.xinran.qxdadian;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;

import com.xinran.qxdadian.base.QxBaseActivity;
import com.xinran.qxdadian.fragments.SevenFragmentForViewPager;
import com.xinran.qxdadian.fragments.SixFragmentForViewPager;

/**
 * Created by qixinh on 16/6/16.
 */
public class FragmentManagerActivity extends QxBaseActivity {

    private FragmentManager mFragmentManager;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_manager);

        mFragmentManager = getSupportFragmentManager();
        FragmentTransaction mFragTransation = mFragmentManager.beginTransaction();
        mFragTransation.replace(R.id.fragment_container, new SixFragmentForViewPager());
        mFragTransation.commitAllowingStateLoss();
        $(R.id.btn_change_frag).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction mFragTransation = mFragmentManager.beginTransaction();
                mFragTransation.replace(R.id.fragment_container, new SevenFragmentForViewPager());
                mFragTransation.commitAllowingStateLoss();
            }
        });
    }
}
