package pokemonTypes;

import java.util.List;

public class FirePokemon extends Pokemon {

    private String[] moves = {"inferno", "pyroball", "firelash", "flame thrower"};

    public FirePokemon(String species, int level, int hp, String name, String sound) {
        super(species, level, hp, name, sound);
        this.setAttacks(moves);
    }

    @Override
    public String getType() {
        return "fire";
    }

    // Methods
    public void inferno(Pokemon attacker, Pokemon defender) {
        int infernoDamage = 10;
        System.out.println(attacker + " used Inferno!");
        defender.setHp(defender.getHp() - infernoDamage);
    }
    

}
