package com.xinran.qxdadian.base;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.view.View;

import com.xinran.qxdadian.QxApp;

/**
 * Created by qixinh on 16/6/15.
 */
public  class QxBaseActivity extends FragmentActivity {
    protected Bundle mBundle;
    private final static String EXTRA_FROM_ACTIVITY="extra_from_activity";
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBundle = savedInstanceState == null ? getIntent().getExtras() : savedInstanceState;
        if (mBundle == null) {
            mBundle = new Bundle();
        }
        Log.e("Pid","from:"+fromActivityName()+"; to:"+getClass().getSimpleName());
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        if(mBundle!=null){
            outState.putAll(mBundle);
        }
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onResume() {
        super.onResume();
        QxApp.prePageName=null;
    }

    @Override
    protected void onPause() {
        super.onPause();
    }
    /**
     * 获得来源Activity的名字，有可能为null
     * @return
     */
    public String fromActivityName(){
        return mBundle.getString(EXTRA_FROM_ACTIVITY);
    }

    public void qxStartActivity(Intent intent) {
        intent.putExtra(EXTRA_FROM_ACTIVITY, getClass().getSimpleName());
        startActivity(intent);
    }


    public void qxStartActivity(Class<? extends Activity> cls) {
        qxStartActivity(cls, null);
    }

    /* 打开新的Activity */
    public void qxStartActivity(Class<? extends Activity> cls, Bundle bundle) {
        Intent intent = new Intent();
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        intent.setClass(this, cls);
        intent.putExtra(EXTRA_FROM_ACTIVITY, getClass().getSimpleName());
        startActivity(intent);
    }
    @Override
    public void startActivityForResult(Intent intent, int requestCode) {

        intent.putExtra(EXTRA_FROM_ACTIVITY, getClass().getSimpleName());
        super.startActivityForResult(intent, requestCode);
    }

    @Override
    public void startActivityFromFragment(Fragment fragment, Intent intent, int requestCode) {
        intent.putExtra(EXTRA_FROM_ACTIVITY, getClass().getSimpleName()+"的"+fragment.getClass().getSimpleName());
        super.startActivityFromFragment(fragment, intent, requestCode);
    }
    protected <V extends View> V $(@IdRes int id){
        return (V) findViewById(id);
    }

    @Override
    public void finish() {
        super.finish();
        Log.e("Pid", "finish-from:" + getClass().getSimpleName() + "; to:" + fromActivityName());

    }
}
