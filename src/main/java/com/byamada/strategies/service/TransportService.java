package com.byamada.strategies.service;

import com.byamada.strategies.Motorcycle;
import com.byamada.strategies.TransportConstructStrategy;
import com.byamada.strategies.TransportMean;
import com.byamada.strategies.Vehicle;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TransportService {

    private final List<TransportConstructStrategy> strategies;

    public void execute() {
        List<TransportMean> transportMeans;

        TransportMean vectra = new Vehicle("Vectra","1.8",4);
        TransportMean celta = new Vehicle("Celta","1.0",2);
        TransportMean corsa = new Vehicle("Corsa","1.0",2);

        TransportMean cg = new Motorcycle("cg","100",false);
        TransportMean titam = new Motorcycle("Titan","150",false);

        TransportMean civic = new Vehicle("Civic","2.0",4);
        TransportMean fusion = new Vehicle("Fusion", "3.0",4);

        TransportMean falcon = new Motorcycle("Falcon","300",true);
        TransportMean hornet = new Motorcycle("Hotnet","500",false);

        transportMeans = Arrays.asList(vectra,celta,corsa,cg,titam,civic,fusion,falcon,hornet);

        for(TransportMean tm : transportMeans) {
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
