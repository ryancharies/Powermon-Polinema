package com.pltu.polinema.menu.main.ui.turbin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.pltu.polinema.R;
import com.pltu.polinema.databinding.ActivityDetailTurbinBinding;

public class DetailTurbinActivity extends AppCompatActivity {
    ActivityDetailTurbinBinding mView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mView = DataBindingUtil.setContentView(this,R.layout.activity_detail_turbin);

    }
}