package com.byamada.strategies.model;

public abstract class AbstractTransportMean {

    private String name;
    private String motor;
    private int qtyWheels;
    private int speed;

    public abstract void  buildTransport();
    public abstract String start();
    public abstract String stop();

    public String changeSpeed(int speed) {
        setSpeed(speed);
        return "Actual speed: " + getSpeed();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public int getQtyWheels() {
        return qtyWheels;
    }

    public void setQtyWheels(int qtyWheels) {
        this.qtyWheels = qtyWheels;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
