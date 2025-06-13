package pokemonTypes;

public class GrassPokemon extends Pokemon {

    private String[] moves = {"leafStorm", "solarBeam", "leechSeed", "leafBlade"};

    public GrassPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound);
        this.setAttacks(moves);
    }

    @Override
    public String getType() {
        return "grass";
    }

    public void leafStorm(Pokemon attacker, Pokemon defender) {
        int damage = 10;
        System.out.println(attacker.getName() + " used Leaf Storm!");
        defender.setHp(defender.getHp() - damage);
    }

    public void solarBeam(Pokemon attacker, Pokemon defender) {
        int damage = 20;
        System.out.println(attacker.getName() + " used Solar Beam! " + attacker + " must recharge.");
        defender.setHp(defender.getHp() - damage);
    }

    public void leechSeed(Pokemon attacker, Pokemon defender) {
        int damage = 0;
        System.out.println(attacker.getName() + " used Leech Seed! " + defender + " was seeded!");
        defender.setHp(defender.getHp() - damage);
    }

    public void leafBlade(Pokemon attacker, Pokemon defender) {
        int damage = 30;
        System.out.println(attacker.getName() + " used Leaffff Blade!");
        defender.setHp(defender.getHp() - damage);
    }
}
