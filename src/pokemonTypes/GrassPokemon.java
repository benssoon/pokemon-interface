package pokemonTypes;

public class GrassPokemon extends Pokemon {

    private String[] moves = {"leafStorm", "solarBeam", "leechSeed", "leafBlade"};

    public GrassPokemon(String species, int level, int hp, String name, String sound) {
        super(species, level, hp, name, sound);
    }

    @Override
    public String getType() {
        return "grass";
    }

    public void leafStorm(Pokemon attacker, Pokemon defender) {
        int damage = 10;
        System.out.println(attacker + " used Leaf Storm!");
        defender.setHp(defender.getHp() - damage);
    }

    public void solarBeam(Pokemon attacker, Pokemon defender) {
        int damage = 20;
        System.out.println(attacker + " used Solar Beam! " + attacker + " must recharge.");
        defender.setHp(defender.getHp() - damage);
    }

    public void leechSeed(Pokemon attacker, Pokemon defender) {
        int damage = 0;
        System.out.println(attacker + " used Leech Seed! " + defender + " was seeded!");
        defender.setHp(defender.getHp() - damage);
    }

    public void leafBlade(Pokemon attacker, Pokemon defender) {
        int damage = 30;
        System.out.println(attacker + " used Leaffff Blade!");
        defender.setHp(defender.getHp() - damage);
    }
}
