package creationalPatterns.abstractFactory;

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
