package com.CK.Q1.Degiskenler;

import java.util.UUID;

public class Otomobil {

    String id;
    String marka;
    String model;
    double motor;
    String yili;

    public Otomobil() {
        id = UUID.randomUUID().toString();
    }

    public Otomobil(String marka, String model, double motor, String yili) {
        this();
        this.marka = marka;
        this.model = model;
        this.motor = motor;
        this.yili = yili;
    }

    @Override
    public String toString() {
        return "Otomobil{" +
                "id='" + id + '\'' +
                ", marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", motor=" + motor +
                ", yili='" + yili + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getMotor() {
        return motor;
    }

    public void setMotor(double motor) {
        this.motor = motor;
    }

    public String getYili() {
        return yili;
    }

    public void setYili(String yili) {
        this.yili = yili;
    }
}
