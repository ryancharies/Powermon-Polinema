package com.powermon.polinema.menu.main.ui.notifications;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.powermon.polinema.component.adapter.NotificationAdapter;
import com.powermon.polinema.component.adapter.TurbinAdapter;
import com.powermon.polinema.component.model.Notification;
import com.powermon.polinema.component.model.Turbin;
import com.powermon.polinema.databinding.FragmentDashboardBinding;
import com.powermon.polinema.databinding.FragmentNotificationsBinding;

import java.util.ArrayList;

public class NotificationsFragment extends Fragment {
    private NotificationAdapter mAdapter;
    private ArrayList<Notification> listData;
    private FragmentNotificationsBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentNotificationsBinding.inflate(inflater, container, false);


        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        listData = new ArrayList<>();
        listData.add(new Notification("Test","Baru Saja",1));
        listData.add(new Notification("Test","12:00",1));
        listData.add(new Notification("Test","13:00",2));
        listData.add(new Notification("Test","15:00",0));
        listData.add(new Notification("Test","19:00",1));
        listData.add(new Notification("Test","Kemarin",1));
        listData.add(new Notification("Test","Kemarin",0));
        listData.add(new Notification("Test","Kemarin",1));



        mAdapter = new NotificationAdapter(listData);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(getActivity(),
                layoutManager.getOrientation());
        binding.rvNotifikasi.setHasFixedSize(true);
        binding.rvNotifikasi.setLayoutManager(layoutManager);
        binding.rvNotifikasi.setAdapter(mAdapter);

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}