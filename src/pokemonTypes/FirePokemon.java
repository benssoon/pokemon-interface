package pokemonTypes;

import java.util.List;

public class FirePokemon extends Pokemon {

    private String[] moves = {"inferno", "pyroBall", "fireLash", "flameThrower"};

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
        int damage = 10;
        System.out.println(attacker + " used Inferno!");
        defender.setHp(defender.getHp() - damage);
    }

    public void pyroBall(Pokemon attacker, Pokemon defender) {
        int damage = 20;
        System.out.println(attacker + " used Pyroball!");
        defender.setHp(defender.getHp() - damage);
    }

    public void fireLash(Pokemon attacker, Pokemon defender) {
        int damage = 30;
        System.out.println(attacker + " used Firelash!");
        defender.setHp(defender.getHp() - damage);
    }

    public void flameThrower(Pokemon attacker, Pokemon defender) {
        int damage = 40;
        System.out.println(attacker + " used Flame Thrower!");
        defender.setHp(defender.getHp() - damage);
    }
}
