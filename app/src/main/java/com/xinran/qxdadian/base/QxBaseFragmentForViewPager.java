package com.xinran.qxdadian.base;

import android.util.Log;


import com.xinran.qxdadian.QxApp;

/**
 * Created by qixinh on 16/6/15.
 */
public class QxBaseFragmentForViewPager extends QxBaseFragment {
    @Override
    protected void viewPagerUELogPager(String prePageName, String curName) {
        Log.e("Pid", "from:" + prePageName + ";to:" + curName);
        QxApp.prePageName = curName;
    }

    @Override
    protected void savaPrePagerName(String simpleName) {
        //空实现不用管
    }

    @Override
    protected void UELogPager(String prePageName, String curName) {
        //空实现不用管
    }


}
