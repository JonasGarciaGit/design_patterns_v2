package creationalPatterns.abstractFactory.factoryInterface.impl;

import creationalPatterns.abstractFactory.factoryInterface.PokemonFactory;
import creationalPatterns.abstractFactory.productInterface.Bulbasaur;
import creationalPatterns.abstractFactory.productInterface.Eeeve;
import creationalPatterns.abstractFactory.productInterface.impl.WaterBulbasaur;
import creationalPatterns.abstractFactory.productInterface.impl.WaterEeve;

public class WaterPokemonFactory implements PokemonFactory {
    @Override
    public Eeeve createEeve() {
        return new WaterEeve();
    }

    @Override
    public Bulbasaur createBulbasaur() {
        return new WaterBulbasaur();
    }
}
