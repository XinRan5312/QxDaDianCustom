package com.xinran.qxdadian.base;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.xinran.qxdadian.QxApp;

/**
 * Created by qixinh on 16/6/15.
 */
public abstract class QxBaseFragment extends Fragment {


    private static String TAG = "QX";


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.i(TAG, "fragment is onCreat" + getClass().getSimpleName());
    }


    @Override
    public void onSaveInstanceState(Bundle outState) {

        super.onSaveInstanceState(outState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.i(TAG, "fragment is onCreatVie" + getClass().getSimpleName());
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onResume() {
        super.onResume();
//        Log.e("Pid", "from:" + fromName() + "; to:" + getClass().getSimpleName());
        Log.i(TAG, "fragment is onResum" + getClass().getSimpleName());
        UELogPager(QxApp.prePageName, getClass().getSimpleName());
    }

    @Override
    public void onPause() {
        super.onPause();

        savaPrePagerName(getClass().getSimpleName());

    }


    @Override
    public void onDestroyView() {
//        QxApp.prePageName=getClass().getSimpleName();
//        mBundle.putString(EXTRA_FROM_ACTIVITY, getClass().getSimpleName());
        Log.i(TAG, "fragment is onDestroyVie" + getClass().getSimpleName());
        super.onDestroyView();
    }

    @Override
    public void onDestroy() {
//        mBundle.putString(EXTRA_FROM_ACTIVITY, getClass().getSimpleName());
        Log.i(TAG, "fragment is onDestry" + getClass().getSimpleName());
        super.onDestroy();
    }

    protected void qxStrartActvityFromFrament(QxBaseFragment fragment, Class<? extends QxBaseActivity> cls, int requestCode) {
        QxBaseActivity activity = (QxBaseActivity) fragment.getActivity();
        activity.startActivityFromFragment(fragment, new Intent(activity, cls), requestCode);
    }

    /**
     * 处理ViewPagerAdapter专用
     *
     * @param isVisibleToUser
     */
    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        if (isVisibleToUser) {
//            Log.e("Pid", "from:" + QxApp.prePageName + ";to:" + getClass().getSimpleName());
//            QxApp.prePageName = getClass().getSimpleName();
            viewPagerUELogPager(QxApp.prePageName, getClass().getSimpleName());
        }
    }

    //放到ViewPager的Fragment要实现的
    protected abstract void viewPagerUELogPager(String prePageName, String curName);

    //没有放到ViewPager的Fragment要实现的
    protected abstract void savaPrePagerName(String simpleName);

    //没有放到ViewPager的Fragment要实现的
    protected abstract void UELogPager(String prePageName, String curName);

}
