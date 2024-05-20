package creationalPatterns.abstractFactory.factoryInterface.impl;

import creationalPatterns.abstractFactory.factoryInterface.PokemonFactory;
import creationalPatterns.abstractFactory.productInterface.Bulbasaur;
import creationalPatterns.abstractFactory.productInterface.Eeeve;
import creationalPatterns.abstractFactory.productInterface.impl.FireBulbasaur;
import creationalPatterns.abstractFactory.productInterface.impl.FireEeve;

public class FirePokemonFactory implements PokemonFactory {
    @Override
    public Eeeve createEeve() {
        return new FireEeve();
    }

    @Override
    public Bulbasaur createBulbasaur() {
        return new FireBulbasaur();
    }
}
