package com.xinran.qxdadian.fragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.xinran.qxdadian.MainActivity;
import com.xinran.qxdadian.R;

import com.xinran.qxdadian.base.QxBaseFragmentForNormal;


/**
 * Created by qixinh on 16/6/15.
 */
public class SevenFragmentForViewPager extends QxBaseFragmentForNormal {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_seven,container,false);
        v.findViewById(R.id.btn_senven_frag).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              qxStrartActvityFromFrament(SevenFragmentForViewPager.this,MainActivity.class,101);
            }
        });
        return v;
    }
}
