package pokemonTypes;

public class ElectricPokemon extends Pokemon{

    private String[] moves = {"thunderPunch", "electroBall", "thunder", "voltTackle"};

    public ElectricPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound);
        this.setAttacks(moves);
    }

    @Override
    public String getType() {
        return "electric";
    }

    public void thunderPunch(Pokemon attacker, Pokemon defender) {
        int damage = 10;
        System.out.println(attacker.getName() + " used Thunder Punch!");
        attacker.dealDamage(defender, damage);
    }

    public void electroBall(Pokemon attacker, Pokemon defender) {
        int damage = 20;
        System.out.println(attacker.getName() + " used Electroball!");
        attacker.dealDamage(defender, damage);
    }

    public void thunder(Pokemon attacker, Pokemon defender) {
        int damage = 30;
        System.out.println(attacker.getName() + " used Thunder!");
        attacker.dealDamage(defender, damage);
    }

    public void voltTackle(Pokemon attacker, Pokemon defender) {
        int damage = 40;
        System.out.println(attacker.getName() + " used Volt Tackle!");
        attacker.dealDamage(defender, damage);
    }
}
