package pokemonTypes;

import java.util.List;

public abstract class Pokemon {

    // Properties
    private String species;
    private int level;
    private int hp;
    private String name;
    private String sound;
    private List<String> attacks;

    // Constructor


    public Pokemon(String species, int level, int hp, String name, String sound) {
        this.species = species;
        this.level = level;
        this.hp = hp;
        this.name = name;
        this.sound = sound;
    }

    // Getters
    public String getName() {
        return this.name;
    }

    public String getSpecies() {
        return this.species;
    }

    public int getLevel() {
        return this.level;
    }

    public int getHp() {
        return this.hp;
    }

    public String getSound() {
        return this.sound;
    }

    public abstract String getType();

    public abstract String getAttacks();

    public void addAttack(String attack) {
        this.attacks.add(attack);
    }
}
