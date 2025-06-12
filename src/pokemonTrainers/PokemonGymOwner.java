package pokemonTrainers;

import pokemonTypes.Pokemon;

import java.util.List;

public class PokemonGymOwner extends PokemonTrainer {
    private String town;

    public PokemonGymOwner(String name, List<Pokemon> pokemons, String town) {
        super(name, pokemons);
        this.town = town;
    }
}
