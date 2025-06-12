package pokemonTypes;

public class Pokemon {

    // Properties
    private String species;
    private int weight;
    private int height;
    private String name;
    private String cry;


    // Constructor


    public Pokemon(String species, int weight, int height, String name, String cry) {
        this.species = species;
        this.weight = weight;
        this.height = height;
        this.name = name;
        this.cry = cry;
    }

    // Getters & Setters
    public String getName() {
        return this.name;
    }
}
