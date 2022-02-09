package com.byamada.strategies.strategy;

import com.byamada.strategies.model.AbstractTransportMean;

public interface TransportConstructStrategy {

    boolean dosApply(AbstractTransportMean transportMean);
    AbstractTransportMean build(AbstractTransportMean transportMean);
    void testDrive();
}
