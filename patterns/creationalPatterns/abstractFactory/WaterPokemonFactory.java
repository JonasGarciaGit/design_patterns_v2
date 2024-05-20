package creationalPatterns.abstractFactory;

public class WaterPokemonFactory implements PokemonFactory{
    @Override
    public Eeeve createEeve() {
        return new WaterEeve();
    }

    @Override
    public Bulbasaur createBulbasaur() {
        return new WaterBulbasaur();
    }
}
