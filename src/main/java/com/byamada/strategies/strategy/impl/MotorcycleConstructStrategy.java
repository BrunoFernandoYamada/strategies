package com.byamada.strategies.strategy.impl;

import com.byamada.strategies.model.Motorcycle;
import com.byamada.strategies.model.AbstractTransportMean;
import com.byamada.strategies.strategy.TransportConstructStrategy;
import org.springframework.stereotype.Component;

@Component
public class MotorcycleConstructStrategy implements TransportConstructStrategy {

    AbstractTransportMean transportMean;

    @Override
    public boolean dosApply(AbstractTransportMean transportMean) {
        if(transportMean instanceof Motorcycle) {
            return true;
        }
        return false;
    }

    @Override
    public AbstractTransportMean build(AbstractTransportMean transportMean) {
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
