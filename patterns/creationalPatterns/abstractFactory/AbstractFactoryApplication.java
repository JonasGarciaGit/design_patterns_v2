package creationalPatterns.abstractFactory;

import creationalPatterns.abstractFactory.factoryInterface.PokemonFactory;
import creationalPatterns.abstractFactory.productInterface.Bulbasaur;
import creationalPatterns.abstractFactory.productInterface.Eeeve;

public class AbstractFactoryApplication {

    private PokemonFactory pokemonFactory;
    private Eeeve eeeve;
    private Bulbasaur bulbasaur;

    public AbstractFactoryApplication(PokemonFactory pokemonFactory){
        this.pokemonFactory = pokemonFactory;
        this.eeeve = pokemonFactory.createEeve();
        this.bulbasaur = pokemonFactory.createBulbasaur();
    }

    public Eeeve getEeeve() {
        return eeeve;
    }

    public Bulbasaur getBulbasaur() {
        return bulbasaur;
    }
}
