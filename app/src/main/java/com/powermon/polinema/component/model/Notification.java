package com.powermon.polinema.component.model;

public class Notification {
    String Msg,Time;
    int Status;

    public Notification(String msg, String time, int status) {
        Msg = msg;
        Time = time;
        Status = status;
    }

    public String getMsg() {
        return Msg;
    }

    public void setMsg(String msg) {
        Msg = msg;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        Time = time;
    }

    public int getStatus() {
        return Status;
    }

    public void setStatus(int status) {
        Status = status;
    }
}
