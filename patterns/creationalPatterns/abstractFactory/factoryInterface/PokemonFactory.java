package creationalPatterns.abstractFactory.factoryInterface;

import creationalPatterns.abstractFactory.productInterface.Bulbasaur;
import creationalPatterns.abstractFactory.productInterface.Eeeve;

public interface PokemonFactory {
    public Eeeve createEeve();
    public Bulbasaur createBulbasaur();
}
