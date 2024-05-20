package creationalPatterns.abstractFactory.productInterface.impl;

import creationalPatterns.abstractFactory.productInterface.Eeeve;

public class WaterEeve implements Eeeve {
    @Override
    public void evolve() {
        System.out.println("Eeve evolve to water type...");
    }
}
