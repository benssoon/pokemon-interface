package pokemonTypes;

public class GrassPokemon extends Pokemon {

    private String[] moves = {"leafStorm", "solarBeam", "leechSeed", "leafBlade"};
    private static final String TYPE = "grass";

    public GrassPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, TYPE);
        this.setAttacks(moves);
    }

    /*@Override
    public String getType() {
        return "grass";
    }*/

    public void leafStorm(Pokemon attacker, Pokemon defender) {
        int damage = 10;
        System.out.println(attacker.getName() + " used Leaf Storm!");
        attacker.dealDamage(defender, damage);
    }

    public void solarBeam(Pokemon attacker, Pokemon defender) {
        int damage = 20;
        System.out.println(attacker.getName() + " used Solar Beam! " + attacker.getName() + " must recharge.");
        attacker.dealDamage(defender, damage);
    }

    public void leechSeed(Pokemon attacker, Pokemon defender) {
        int damage = 50;
        System.out.println(attacker.getName() + " used Leech Seed! " + defender.getName() + " was seeded!");
        attacker.dealDamage(defender, damage);
    }

    public void leafBlade(Pokemon attacker, Pokemon defender) {
        int damage = 30;
        System.out.println(attacker.getName() + " used Leaffff Blade!");
        attacker.dealDamage(defender, damage);
    }
}
