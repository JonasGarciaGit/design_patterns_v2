package creationalPatterns.abstractFactory;

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
