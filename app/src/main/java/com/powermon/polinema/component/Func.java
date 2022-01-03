package com.powermon.polinema.component;

import android.content.Context;
import android.content.DialogInterface;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;

import com.afollestad.materialdialogs.MaterialDialog;

public class Func {
    private static MaterialDialog dialog;
    public static void hideProgressBar(){
        if (dialog.isShowing())
            dialog.dismiss();
    }
    public static void showLog(String message) {
        System.out.println(message);
    }
    public static void showAlert(String tittle, String msg, Context context){
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setMessage(msg);
        builder.setTitle(tittle);
        builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {

            }
        });
        AlertDialog dialog = builder.create();
        dialog.show();
    }

    public static void showToast(String gagal_, Context applicationContext) {
        Toast.makeText(applicationContext,gagal_, Toast.LENGTH_SHORT).show();
    }
    public static void showProgressBar(Context context, String cIsi){
        MaterialDialog.Builder builder = new MaterialDialog.Builder(context)
                .content(cIsi)
                .cancelable(false)
                .progress(true, 0);
        dialog = builder.build();
        dialog.show();
    }
}
