package com.byamada.strategies;

import org.springframework.stereotype.Component;

@Component
public class MotorcycleConstructStrategy implements TransportConstructStrategy {

    TransportMean transportMean;

    @Override
    public boolean dosApply(TransportMean transportMean) {
        if(transportMean instanceof Motorcycle) {
            return true;
        }
        return false;
    }

    @Override
    public TransportMean build(TransportMean transportMean) {
        this.transportMean = transportMean;
        transportMean.buildTransport();
        return this.transportMean;
    }

    @Override
    public void testDrive() {
        System.out.println(transportMean.start());
        System.out.println(transportMean.changeSpeed(70));
        System.out.println(transportMean.stop());


    }
}
