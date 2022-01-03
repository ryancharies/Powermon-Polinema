package com.powermon.polinema.component.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.powermon.polinema.R;
import com.powermon.polinema.component.model.Notification;
import com.powermon.polinema.databinding.ItemListNotificationBinding;

import java.util.ArrayList;

public class NotificationAdapter extends RecyclerView.Adapter<NotificationAdapter.Holder> {
    private ArrayList<Notification> listNotification;
    private Context context;

    public NotificationAdapter(ArrayList<Notification> listNotification) {
        this.listNotification = listNotification;
    }

    @NonNull
    @Override
    public NotificationAdapter.Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        ItemListNotificationBinding mView = ItemListNotificationBinding.inflate(LayoutInflater.from(context),parent,false);
        return new Holder(mView);
    }

    @Override
    public void onBindViewHolder(@NonNull NotificationAdapter.Holder holder, int position) {
        holder.bind(position);
    }

    @Override
    public int getItemCount() {
        return listNotification.size();
    }

    public class Holder extends RecyclerView.ViewHolder {
        ItemListNotificationBinding mView;
        public Holder(@NonNull ItemListNotificationBinding itemView) {
            super(itemView.getRoot());
            mView = itemView;
        }
        void bind(int pos){
            Notification notification = listNotification.get(pos);
            mView.tvTime.setText(notification.getTime());
            switch (notification.getStatus()){
                case 0:
                    mView.imgTurbin.setImageResource(R.drawable.turbin_red);

                    mView.tvMsg.setText("BAHAYA!!");
                    mView.tvResiko.setText("Resiko Tinggi");
                    break;
                case 1:
                    mView.tvResiko.setText("Resiko Rendah");
                    mView.tvMsg.setText("Turbin Aman");

                    mView.imgTurbin.setImageResource(R.drawable.turbin_green);
                    break;
                case 2:

                    mView.tvMsg.setText("PERINGATAN!!");
                    mView.tvResiko.setText("Resiko Rendah");
                    mView.imgTurbin.setImageResource(R.drawable.turbin_yellow);
                    break;

            }
        }
    }
}
