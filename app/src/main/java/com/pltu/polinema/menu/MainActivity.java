package com.pltu.polinema.menu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;
import com.pltu.polinema.component.Func;
import com.pltu.polinema.R;
import com.pltu.polinema.databinding.ActivityMainBinding;

import java.io.UnsupportedEncodingException;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding mView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mView = DataBindingUtil.setContentView(this, R.layout.activity_main);
        loadRS();
    }
    private void loadRS(){


        Func.showProgressBar(this,"Wait...");
        String cURL = "http://ebt.sytes.net/public/api/dummy.json";
        Func.showLog("Emil " + cURL);
        StringRequest stringRequest = new StringRequest(Request.Method.GET, cURL,
                new Response.Listener<String>() {

                    @Override
                    public void onResponse(String response) {

                        Func.showLog("aa " + response );
                        Func.hideProgressBar();
                        // Display the first 500 characters of the response string.
                        if(response!= null){
                            Dummy dummy = new Gson().fromJson(response,Dummy.class);
                            mView.tvDateTime.setText( "DateTime : " + dummy.getDatetime());
                            mView.tvWinddir.setText("winddir : " +String.valueOf(dummy.getWinddir()));
                            mView.tvWindspeedmph.setText("windspeedmph : " +String.valueOf(dummy.getWindspeedmph()));
                            mView.tvWindgustmph.setText("windgustmph : " +String.valueOf(dummy.getWindgustmph()));
                            mView.tvType.setText("type : " +String.valueOf(dummy.getType()));
                            mView.tvV.setText("V : " +String.valueOf(dummy.getV()));
                            mView.tvA.setText("A : " +String.valueOf(dummy.getA()));
                            mView.tvW.setText("W : " +String.valueOf(dummy.getW()));
                            mView.tvkWh.setText("kWh : " +String.valueOf(dummy.getkWh()));
                            mView.tvSensorID.setText("sensorid : " +String.valueOf(dummy.getSensorid()));
                        }else {
                            Func.showAlert("Gagal","Response null", MainActivity.this);
                        }



                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Func.showLog("aa" + error.toString());
                Func.hideProgressBar();
                Func.showLog("aa" + error.toString());
                if(error.networkResponse.data!=null) {
                    try {
                        String body = new String(error.networkResponse.data,"UTF-8");
                        Func.showLog(body);
                    } catch (UnsupportedEncodingException e) {
                        e.printStackTrace();
                    }
                }
            }

        }){


        };
        RequestQueue queue = Volley.newRequestQueue(getApplicationContext());
        queue.add(stringRequest);

    }
}