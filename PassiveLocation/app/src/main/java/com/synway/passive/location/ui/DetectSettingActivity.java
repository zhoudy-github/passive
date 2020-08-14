package com.synway.passive.location.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ImageView;

import com.synway.passive.location.R;
import com.synway.passive.location.base.BaseActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public class DetectSettingActivity extends BaseActivity {
    @BindView(R.id.ivBack)
    ImageView ivBack;

    private Unbinder unbinder;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detect_setting);
        unbinder = ButterKnife.bind(this);
        initVies();
    }

    private void initVies(){
        ivBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
