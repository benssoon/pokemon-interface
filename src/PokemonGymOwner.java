import pokemonTypes.Pokemon;

import java.util.List;

public class PokemonGymOwner {
    private String town;
    private String name;
    private List<Pokemon> allPokemon;

    public PokemonGymOwner(String name, String town, List<Pokemon> allPokemon) {
        this.name = name;
        this.town = town;
        this.allPokemon = allPokemon;
    }

    public String getTown() {
        return this.town;
    }

    public String getName() {
        return this.name;
    }
}
