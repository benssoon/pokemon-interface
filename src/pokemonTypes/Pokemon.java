package pokemonTypes;

public class Pokemon {

    // Properties
    private String species;
    private int level;
    private int hp;
    private String name;
    private String sound;

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
}
