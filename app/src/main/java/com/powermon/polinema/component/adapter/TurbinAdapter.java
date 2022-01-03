package com.powermon.polinema.component.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.powermon.polinema.R;
import com.powermon.polinema.component.model.Turbin;
import com.powermon.polinema.databinding.ItemListTurbinBinding;
import com.powermon.polinema.menu.main.ui.turbin.DetailTurbinActivity;

import java.util.ArrayList;

public class TurbinAdapter extends RecyclerView.Adapter<TurbinAdapter.Holder> {
    ArrayList<Turbin> listTurbin ;
    Context context;

    public TurbinAdapter(ArrayList<Turbin> listTurbin) {
        this.listTurbin = listTurbin;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        ItemListTurbinBinding mViw = ItemListTurbinBinding.inflate(LayoutInflater.from(context),parent,false);

        return new Holder(mViw);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
        holder.bind(position);
    }

    @Override
    public int getItemCount() {
        return listTurbin.size();
    }

    public class Holder extends RecyclerView.ViewHolder {
        ItemListTurbinBinding mView;
        public Holder(@NonNull ItemListTurbinBinding itemView) {
            super(itemView.getRoot());
            mView = itemView;
        }
        void bind(int pos){
           Turbin turbin = listTurbin.get(pos);
           mView.tvTurbin.setText(turbin.getNama());
           mView.lyTurbin.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   context.startActivity(new Intent(context, DetailTurbinActivity.class));
               }
           });
           switch (turbin.getStatus()){
               case 0:
                   mView.imgTurbin.setImageResource(R.drawable.turbin_red);
                   break;
               case 1:
                   mView.imgTurbin.setImageResource(R.drawable.turbin_green);
                   break;
               case 2:
                   mView.imgTurbin.setImageResource(R.drawable.turbin_yellow);
                   break;

           }
        }
    }
}
