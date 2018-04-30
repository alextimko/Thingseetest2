package com.example.alex.thingseetest2;

/**
 * Created by Alex on 18/04/2018.
 */

public class SensorValue {
    float temp;
    float lux;
    float hum;
    float pressure;
    float impact;

    public SensorValue() {
    }

    public SensorValue(float temp, float lux, float hum, float pressure, float impact) {
        this.temp = temp;
        this.lux = lux;
        this.hum = hum;
        this.pressure = pressure;
        this.impact = impact;
    }

    public float getTemp() {
        return temp;
    }

    public void setTemp(float temp) {
        this.temp = temp;
    }

    public float getLux() {
        return lux;
    }

    public void setLux(float lux) {
        this.lux = lux;
    }

    public float getHum() {
        return hum;
    }

    public void setHum(float hum) {
        this.hum = hum;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    public float getImpact() {
        return impact;
    }

    public void setImpact(float impact) {
        this.impact = impact;
    }
}
