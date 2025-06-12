package pokemonTypes;

import java.util.Arrays;
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

    public List<String> getAttacks() {
        return this.attacks;
    }

    // Setters

    public void setName(String name) {
        this.name = name;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public void setAttacks(String[] moves) {
        this.attacks.addAll(Arrays.asList(moves));
    }
}
