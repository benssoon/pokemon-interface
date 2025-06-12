package pokemonTrainers;

import java.util.List;
import pokemonTypes.Pokemon;

public class PokemonTrainer {
    private String name;
    private List<Pokemon> pokemons;

    public PokemonTrainer(String name, List<Pokemon> pokemons) {
        this.name = name;
        this.pokemons = pokemons;
    }

    public String getName() {
        return this.name;
    }

    public List<Pokemon> getPokemons() {
        return this.pokemons;
    }
}
