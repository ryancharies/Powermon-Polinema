package com.powermon.polinema.component.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.powermon.polinema.component.model.Akun;
import com.powermon.polinema.databinding.ItemListAkunBinding;

import java.util.ArrayList;

public class ListAkunAdapter extends RecyclerView.Adapter<ListAkunAdapter.Holder> {
    private Context context;
    private ArrayList<Akun> akunArrayList;

    public ListAkunAdapter(ArrayList<Akun> akunArrayList) {
        this.akunArrayList = akunArrayList;
    }

    @NonNull
    @Override
    public ListAkunAdapter.Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        ItemListAkunBinding mView = ItemListAkunBinding.inflate(LayoutInflater.from(context),parent,false);
        return new Holder(mView);
    }

    @Override
    public void onBindViewHolder(@NonNull ListAkunAdapter.Holder holder, int position) {
        holder.bind(position);
    }

    @Override
    public int getItemCount() {
        return akunArrayList.size();
    }

    public class Holder extends RecyclerView.ViewHolder {
        ItemListAkunBinding mView;
        public Holder(@NonNull ItemListAkunBinding itemView) {
            super(itemView.getRoot());
            mView = itemView;
        }
        void bind(int pos){
            Akun akun = akunArrayList.get(pos);
            mView.tvNamaAkun.setText(akun.getNama());

        }
    }
}
