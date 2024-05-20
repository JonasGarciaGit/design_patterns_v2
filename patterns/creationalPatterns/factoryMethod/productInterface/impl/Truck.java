package creationalPatterns.factoryMethod.productInterface.impl;

import creationalPatterns.factoryMethod.productInterface.Transport;

public class Truck implements Transport {
    @Override
    public void deliver() {
        System.out.println("Deliver by road...");
    }
}
