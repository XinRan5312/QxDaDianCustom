package com.xinran.qxdadian;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


import com.xinran.qxdadian.base.QxBaseActivity;

/**
 * Created by qixinh on 16/6/15.
 */
public class ThirdActivity extends QxBaseActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        $(R.id.btn_third).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ThirdActivity.this, MainActivity.class));
            }
        });

    }


}
