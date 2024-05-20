package creationalPatterns.abstractFactory.productInterface.impl;

import creationalPatterns.abstractFactory.productInterface.Bulbasaur;

public class FireBulbasaur implements Bulbasaur {
    @Override
    public void evolve() {
        System.out.println("Bulbasaur evolve to fire type...");
    }
}
