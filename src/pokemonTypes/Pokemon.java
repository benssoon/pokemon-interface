package pokemonTypes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Pokemon {

    // Properties
    private final String name;
    private int level;
    private int hp;
    private final String food;
    private final String sound;
    private List<String> attacks = new ArrayList<>();

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

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setAttacks(String[] moves) {
        this.attacks.addAll(Arrays.asList(moves));
    }

    public void dealDamage(Pokemon defender, int damage) {
        defender.setHp(defender.getHp() - damage);
        System.out.println(defender.getName() + " has " + defender.getHp() + " hp.");
    }
}
