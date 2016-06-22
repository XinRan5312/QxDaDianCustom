package com.xinran.qxdadian;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.xinran.qxdadian.base.QxBaseActivity;

/**
 * Created by qixinh on 16/6/15.
 */
public class SencondActivity extends QxBaseActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Button btn=$(R.id.btn_sencond);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SencondActivity.this, ThirdActivity.class));
            }
        });
    }

}
