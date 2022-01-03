package com.powermon.polinema.component.model;

public class Turbin {
    private String nama;
    private int status;

    public Turbin(String nama, int status) {
        this.nama = nama;
        this.status = status;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
