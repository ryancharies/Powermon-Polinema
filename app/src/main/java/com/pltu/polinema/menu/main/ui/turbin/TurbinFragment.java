package com.pltu.polinema.menu.main.ui.turbin;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.pltu.polinema.R;
import com.pltu.polinema.component.adapter.TurbinAdapter;
import com.pltu.polinema.component.model.Turbin;
import com.pltu.polinema.databinding.FragmentDashboardBinding;

import java.util.ArrayList;

public class TurbinFragment extends Fragment {

    private FragmentDashboardBinding binding;
    private TurbinAdapter turbinAdapter;
    private Turbin turbin;
    private ArrayList<Turbin> listTurbin;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentDashboardBinding.inflate(inflater, container, false);

        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getActivity(),
                R.array.turbin_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        binding.spnTurbin.setAdapter(adapter);

        listTurbin = new ArrayList<>();
        listTurbin.add(new Turbin("Wind Turbin 1",1));
        listTurbin.add(new Turbin("Wind Turbin 2",1));
        listTurbin.add(new Turbin("Wind Turbin 3",0));
        listTurbin.add(new Turbin("Wind Turbin 4",0));
        listTurbin.add(new Turbin("Wind Turbin 5",1));
        listTurbin.add(new Turbin("Wind Turbin 6",1));
        listTurbin.add(new Turbin("Wind Turbin 7",2));
        listTurbin.add(new Turbin("Wind Turbin 8",1));

        turbinAdapter = new TurbinAdapter(listTurbin);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(getActivity(),
                layoutManager.getOrientation());
        binding.rvTurbin.setHasFixedSize(true);

        binding.rvTurbin.setLayoutManager(layoutManager);
        binding.rvTurbin.setAdapter(turbinAdapter);

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}