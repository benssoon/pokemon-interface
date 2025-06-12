package pokemonTypes;

public class WaterPokemon extends Pokemon {

    private String[] moves = {"surf", "hydroPump", "hydroCanon", "rainDance"};

    public WaterPokemon(String species, int level, int hp, String name, String sound) {
        super(species, level, hp, name, sound);
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
        System.out.println(attacker + " used Surf!");
        defender.setHp(defender.getHp() - damage);
    }

    public void hydroPump(Pokemon attacker, Pokemon defender) {
        int damage = 20;
        System.out.println(attacker + " used Hydro Pump!");
        defender.setHp(defender.getHp() - damage);
    }

    public void hydroCanon(Pokemon attacker, Pokemon defender) {
        int damage = 30;
        System.out.println(attacker + " played Pachelbel's Canon in D!  ;-)  "); // Lol spelling.
        defender.setHp(defender.getHp() - damage);
    }

    public void rainDance(Pokemon attacker, Pokemon defender) {
        int damage = 0;
        System.out.println(attacker + " used Rain Dance! It started raining!");
        defender.setHp(defender.getHp() - damage);
    }


}
