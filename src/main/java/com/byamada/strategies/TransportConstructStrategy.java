package com.byamada.strategies;

public interface TransportConstructStrategy {

    boolean dosApply(TransportMean transportMean);
    TransportMean build(TransportMean transportMean);
    void testDrive();
}
