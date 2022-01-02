package com.pltu.polinema.menu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.pltu.polinema.R;
import com.pltu.polinema.databinding.ActivityLoginBinding;
import com.pltu.polinema.menu.main.MainMenuActivity;

public class LoginActivity extends AppCompatActivity {
    ActivityLoginBinding mView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mView = DataBindingUtil.setContentView(this, R.layout.activity_login);
        mView.btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), MainMenuActivity.class));
            }
        });
    }
}