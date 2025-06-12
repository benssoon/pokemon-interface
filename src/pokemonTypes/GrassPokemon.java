package pokemonTypes;

public class GrassPokemon extends Pokemon {

    public GrassPokemon(String species, int level, int hp, String name, String sound) {
        super(species, level, hp, name, sound);
    }

    @Override
    public String getType() {
        return "grass";
    }
}
