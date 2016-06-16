package com.xinran.qxdadian.base;


import android.util.Log;

import com.xinran.qxdadian.QxApp;

/**
 * Created by qixinh on 16/6/15.
 */
public class QxBaseFragmentForNormal extends QxBaseFragment {


    @Override
    protected void savaPrePagerName(String preName) {
        QxApp.prePageName=preName;
    }

    @Override
    protected void UELogPager(String prePageName, String curName) {
        Log.e("Pid", "from:" + prePageName + ";to:" + curName);
    }

    @Override
    protected void viewPagerUELogPager(String prePageName, String curName) {
        //空实现不用管
    }
}
