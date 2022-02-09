package com.byamada.strategies.model;

public class Motorcycle extends AbstractTransportMean {

    private boolean hasCargo;

    public Motorcycle(String name, String motor, boolean hasCargo){
        setName(name);
        setMotor(motor);
        setQtyWheels(2);
        setSpeed(0);
        this.hasCargo = hasCargo;
    }

    @Override
    public void buildTransport() {
        System.out.println("---- # " + getName() + " # ----- ");
        System.out.println("Motor: " + getMotor());
        System.out.println("Quantity wheels: " + getQtyWheels());
        System.out.println("Has cargo: " + hasCargo);

    }

    @Override
    public String start() {
        return "zooom zooom zooom";
    }

    @Override
    public String stop() {
        return "Handle brake + foot brake";
    }
}
