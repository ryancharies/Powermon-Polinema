package com.powermon.polinema.menu.main.ui.account;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.powermon.polinema.R;
import com.powermon.polinema.databinding.FragmentAkunBinding;
import com.powermon.polinema.menu.main.ui.account.general.EditProfilActivity;
import com.powermon.polinema.menu.main.ui.account.general.KelolaAkunActivity;

public class AkunFragment extends Fragment {

    FragmentAkunBinding mView;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mView.tvEditProfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), EditProfilActivity.class));
            }
        });
        mView.tvKelolaAkun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), KelolaAkunActivity.class));
            }
        });
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mView = FragmentAkunBinding.inflate(inflater,container,false);
        return mView.getRoot();
    }


}