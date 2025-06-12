package pokemonTypes;

public class ElectricPokemon extends Pokemon{

    public ElectricPokemon(String species, int level, int hp, String name, String sound) {
        super(species, level, hp, name, sound);
    }

    @Override
    public String getType() {
        return "";
    }
}
