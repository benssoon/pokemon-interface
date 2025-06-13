package pokemonTypes;

import java.util.List;

public class FirePokemon extends Pokemon {

    private String[] moves = {"inferno", "pyroBall", "fireLash", "flameThrower"};

    public FirePokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound);
        this.setAttacks(moves);
    }

    @Override
    public String getType() {
        return "fire";
    }

    // Methods
    public void inferno(Pokemon attacker, Pokemon defender) {
        int damage = 10;
        System.out.println(attacker.getName() + " used Inferno!");
        defender.setHp(defender.getHp() - damage);
    }

    public void pyroBall(Pokemon attacker, Pokemon defender) {
        int damage = 20;
        System.out.println(attacker.getName() + " used Pyroball!");
        defender.setHp(defender.getHp() - damage);
    }

    public void fireLash(Pokemon attacker, Pokemon defender) {
        int damage = 30;
        System.out.println(attacker.getName() + " used Firelash!");
        defender.setHp(defender.getHp() - damage);
    }

    public void flameThrower(Pokemon attacker, Pokemon defender) {
        int damage = 40;
        System.out.println(attacker.getName() + " used Flame Thrower!");
        defender.setHp(defender.getHp() - damage);
    }
}
