package com.powermon.polinema.menu.main.ui.account.general;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.powermon.polinema.R;
import com.powermon.polinema.component.adapter.ListAkunAdapter;
import com.powermon.polinema.component.model.Akun;
import com.powermon.polinema.databinding.ActivityKelolaAkunBinding;

import java.util.ArrayList;

public class KelolaAkunActivity extends AppCompatActivity {
    private ListAkunAdapter mAdapter;
    private ArrayList<Akun> listData;
    ActivityKelolaAkunBinding mView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mView = DataBindingUtil.setContentView(this,R.layout.activity_kelola_akun);

        listData = new ArrayList<>();
        listData.add(new Akun("Nilam Yuniari"));
        listData.add(new Akun("Nilam Yuniari"));
        listData.add(new Akun("Nilam Yuniari"));
        listData.add(new Akun("Nilam Yuniari"));
        listData.add(new Akun("Nilam Yuniari"));
        listData.add(new Akun("Nilam Yuniari"));
        listData.add(new Akun("Nilam Yuniari"));

        mAdapter = new ListAkunAdapter(listData);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(getApplicationContext(),
                layoutManager.getOrientation());
        mView.rvListAkun.setHasFixedSize(true);
        mView.rvListAkun.setLayoutManager(layoutManager);
        mView.rvListAkun.addItemDecoration(dividerItemDecoration);
        mView.rvListAkun.setAdapter(mAdapter);

    }
}