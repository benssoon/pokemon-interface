package pokemonTypes;

public class WaterPokemon extends Pokemon {

    private String[] moves = {"surf", "hydroPump", "hydroCanon", "rainDance"};

    public WaterPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound);
        this.setAttacks(moves);
    }

    @Override
    public String getType() {
        return "water";
    }

    // Methods

    // Is there a more generic way of doing this???
    // Seems so clunky that each move has to have its own method,
    // which basically does the same as all the other methods...

    public void surf(Pokemon attacker, Pokemon defender) {
        int damage = 10;
        System.out.println(attacker.getName() + " used Surf!");
        attacker.dealDamage(defender, damage);
    }

    public void hydroPump(Pokemon attacker, Pokemon defender) {
        int damage = 20;
        System.out.println(attacker.getName() + " used Hydro Pump!");
        attacker.dealDamage(defender, damage);
    }

    public void hydroCanon(Pokemon attacker, Pokemon defender) {
        int damage = 30;
        System.out.println(attacker.getName() + " played Pachelbel's Canon in D!  ;-)  "); // Lol spelling.
        attacker.dealDamage(defender, damage);
    }

    public void rainDance(Pokemon attacker, Pokemon defender) {
        int damage = 0;
        System.out.println(attacker.getName() + " used Rain Dance! It started raining!");
        attacker.dealDamage(defender, damage);
    }


}
