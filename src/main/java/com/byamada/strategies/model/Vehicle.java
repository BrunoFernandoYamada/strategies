package com.byamada.strategies.model;

public class Vehicle extends AbstractTransportMean {

    private int qtyDoors;

    public Vehicle(String name, String motor, int qtyDoors){
        setMotor(motor);
        setName(name);
        setQtyWheels(4);
        setSpeed(0);
        this.qtyDoors = qtyDoors;
    }


    @Override
    public void buildTransport() {
        System.out.println("---- # " + getName() + " # ----- ");
        System.out.println("Motor: " + getMotor());
        System.out.println("Quantity wheels: " + getQtyWheels());
        System.out.println("Quantity doors: " + qtyDoors);

    }

    @Override
    public String start() {
        return "Zrumm Zrumm";
    }

    @Override
    public String stop() {
        return "Foot brake";
    }
}
