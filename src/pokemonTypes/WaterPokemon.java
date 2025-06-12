package pokemonTypes;

public class WaterPokemon extends Pokemon {

    public WaterPokemon(String species, int level, int hp, String name, String sound) {
        super(species, level, hp, name, sound);
    }

    @Override
    public String getType() {
        return "water";
    }


}
