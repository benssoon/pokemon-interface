package pokemonTypes;

public class FirePokemon extends Pokemon {

    public FirePokemon(String species, int level, int hp, String name, String sound) {
        super(species, level, hp, name, sound);
    }

    @Override
    public String getType() {
        return "fire";
    }
    

}
