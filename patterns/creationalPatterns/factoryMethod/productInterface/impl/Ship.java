package creationalPatterns.factoryMethod.productInterface.impl;

import creationalPatterns.factoryMethod.productInterface.Transport;

public class Ship implements Transport {
    @Override
    public void deliver() {
        System.out.println("Deliver by sea...");
    }
}