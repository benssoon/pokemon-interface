package pokemonTypes;

public class ElectricPokemon extends Pokemon{

    private String[] moves = {"thunderPunch", "electroBall", "thunder", "voltTackle"};

    public ElectricPokemon(String species, int level, int hp, String name, String sound) {
        super(species, level, hp, name, sound);
    }

    @Override
    public String getType() {
        return "";
    }

    public void thunderPunch(Pokemon attacker, Pokemon defender) {
        int damage = 10;
        System.out.println(attacker + " used Thunder Punch!");
        defender.setHp(defender.getHp() - damage);
    }

    public void electroBall(Pokemon attacker, Pokemon defender) {
        int damage = 20;
        System.out.println(attacker + " used Electroball!");
        defender.setHp(defender.getHp() - damage);
    }

    public void thunder(Pokemon attacker, Pokemon defender) {
        int damage = 30;
        System.out.println(attacker + " used Thunder!");
        defender.setHp(defender.getHp() - damage);
    }

    public void voltTackle(Pokemon attacker, Pokemon defender) {
        int damage = 40;
        System.out.println(attacker + " used Volt Tackle!");
        defender.setHp(defender.getHp() - damage);
    }
}
