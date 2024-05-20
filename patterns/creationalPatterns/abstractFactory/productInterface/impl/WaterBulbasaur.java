package creationalPatterns.abstractFactory.productInterface.impl;

import creationalPatterns.abstractFactory.productInterface.Bulbasaur;

public class WaterBulbasaur implements Bulbasaur {
    @Override
    public void evolve() {
        System.out.println("Bulbasaur evolve to water type...");
    }
}
