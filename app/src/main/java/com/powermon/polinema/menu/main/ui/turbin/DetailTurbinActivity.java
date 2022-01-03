package com.powermon.polinema.menu.main.ui.turbin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.powermon.polinema.R;
import com.powermon.polinema.databinding.ActivityDetailTurbinBinding;

public class DetailTurbinActivity extends AppCompatActivity {
    ActivityDetailTurbinBinding mView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mView = DataBindingUtil.setContentView(this,R.layout.activity_detail_turbin);

    }
}