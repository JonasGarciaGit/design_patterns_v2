package creationalPatterns.abstractFactory.productInterface.impl;

import creationalPatterns.abstractFactory.productInterface.Eeeve;

public class FireEeve implements Eeeve {
    @Override
    public void evolve() {
        System.out.println("Eeve evolve to fire type...");
    }
}
