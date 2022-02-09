package com.byamada.strategies.service;

import com.byamada.strategies.model.Motorcycle;
import com.byamada.strategies.strategy.TransportConstructStrategy;
import com.byamada.strategies.model.AbstractTransportMean;
import com.byamada.strategies.model.Vehicle;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TransportService {

    private final List<TransportConstructStrategy> strategies;

    public void execute() {
        List<AbstractTransportMean> transportMeans;

        AbstractTransportMean vectra = new Vehicle("Vectra","1.8",4);
        AbstractTransportMean celta = new Vehicle("Celta","1.0",2);
        AbstractTransportMean corsa = new Vehicle("Corsa","1.0",2);

        AbstractTransportMean cg = new Motorcycle("cg","100",false);
        AbstractTransportMean titam = new Motorcycle("Titan","150",false);

        AbstractTransportMean civic = new Vehicle("Civic","2.0",4);
        AbstractTransportMean fusion = new Vehicle("Fusion", "3.0",4);

        AbstractTransportMean falcon = new Motorcycle("Falcon","300",true);
        AbstractTransportMean hornet = new Motorcycle("Hotnet","500",false);

        transportMeans = Arrays.asList(vectra,celta,corsa,cg,titam,civic,fusion,falcon,hornet);

        for(AbstractTransportMean tm : transportMeans) {
            for (TransportConstructStrategy strategy : strategies) {
                if(strategy.dosApply(tm)) {
                    System.out.println("");
                    System.out.println("Building Transport");
                    strategy.build(tm);
                    System.out.println("Test Drive:");
                    strategy.testDrive();
                    System.out.println("---------------");
                    System.out.println("");
                }
            }
        }
    }
}
