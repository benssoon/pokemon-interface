package pokemonTypes;

import java.util.List;

public abstract class Pokemon {

    // Properties
    private String name;
    private int level;
    private int hp;
    private String food;
    private String sound;
    private List<String> attacks;

    // Constructor


    public Pokemon(String name, int level, int hp, String food, String sound) {
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.food = food;
        this.sound = sound;
    }

    // Getters
    public String getFood() {
        return this.food;
    }

    public String getName() {
        return this.name;
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
