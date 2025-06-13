import pokemonTrainers.PokemonGymOwner;
import pokemonTrainers.PokemonTrainer;
import pokemonTypes.*;

import java.util.*;

// Los in deze klasse alle foutmeldingen op door (abstracte) klassen met variabelen en methodes te maken en een interface met methodes (en soms een import).
public class PokemonGymImpl implements PokemonGym {

    List<Pokemon> pokemons;

    public PokemonGymImpl(List<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }

    @Override
    public void enteredTheGym(PokemonTrainer player1) {
        PokemonGymOwner gymOwner = new PokemonGymOwner("Brock", "Pewter City", pokemons);
        System.out.println("You have entered the " + gymOwner.getTown() + " gym");
        System.out.println("In front of you stands a Pokémon trainer");
        System.out.println(Main.ANSI_RED + gymOwner.getName() + Main.ANSI_RESET +": Hello stranger, I'm " + gymOwner.getName() + ", the owner of this gym. Who are you?");
        System.out.println(Main.ANSI_GREEN + player1.getName() + Main.ANSI_RESET + ": I'm " + player1.getName() + " and i'm here to challenge you for a battle");
        System.out.println(Main.ANSI_RED + gymOwner.getName() + Main.ANSI_RESET +": So you're after my badge too, lets fight!!!");

        Pokemon gymPokemon = chooseGymPokemon(gymOwner);
        System.out.println(Main.ANSI_RED + gymOwner.getName() + Main.ANSI_RESET +": I choose you, " + gymPokemon.getFood());
        Pokemon pokemon = choosePokemon(player1);
        System.out.println(Main.ANSI_GREEN + player1.getName() + Main.ANSI_RESET + ": I choose you, " + pokemon.getFood());

        fightRound(player1, gymOwner, pokemon, gymPokemon);

    }

    @Override
    public void printPokemon(List<Pokemon> allPokemon) {
        for (Pokemon p : allPokemon) {
            System.out.println(p.getFood());
        }
    }

    @Override
    public Pokemon selectPokemon(String pokemon, PokemonTrainer trainer) {
        List<Pokemon> pokemons = trainer.getPokemons();
        int number = 0;
        for (int i = 0; i < pokemons.size(); i++) {
            if (pokemons.get(i).getFood().equalsIgnoreCase(pokemon)) {
                number = i;
            }
        }
        return pokemons.get(number);
    }

    @Override
    public void fightRound(PokemonTrainer trainer, PokemonGymOwner gymLeader, Pokemon trainerPokemon, Pokemon gymPokemon) {
        Scanner speler_A = new Scanner(System.in);
        while (trainerPokemon.getHp() > 0 && gymPokemon.getHp() > 0) {

            System.out.println("Its " + gymLeader.getName() + "'s turn to attack");
            gymOwnerAttacks(gymPokemon, trainerPokemon);
            System.out.println("Its " + trainer.getName() + "'s turn to attack");
            attackOrChange(trainerPokemon, gymPokemon, trainer, gymLeader);

        }
        if(trainerPokemon.getHp() <= 0){
            System.out.println(gymPokemon.getFood() + " has defeated " + trainerPokemon.getFood());
        } else if (gymPokemon.getHp() <= 0){
            System.out.println(trainerPokemon.getFood() + " has defeated " + gymPokemon.getFood());
        }

        System.out.println("Would you like to keep playing? yes or no");
        String keepPlaying = speler_A.nextLine();
        if (keepPlaying.equals("yes")){
            enteredTheGym(trainer);
        } else {
            System.out.println("Thank you for playing");
        }
    }

    @Override
    public Pokemon chooseGymPokemon(PokemonGymOwner gymOwner){
        Random rand = new Random();
        List<Pokemon> pokemons = new ArrayList<>();
        for (Pokemon p : gymOwner.getPokemons()) {
            if(p.getHp() > 0 ){
                pokemons.add(p);
            }
        }
        int amountOfPokemons = pokemons.size();
        int randomNumber = rand.nextInt(amountOfPokemons);
        return pokemons.get(randomNumber);
    }

    @Override
    public Pokemon choosePokemon(PokemonTrainer trainer){
        Scanner speler_A = new Scanner(System.in);
        List<Pokemon> pokemons = new ArrayList<>();
        for (Pokemon p : trainer.getPokemons()) {
            if(p.getHp() > 0 ){
                pokemons.add(p);
            }
        }
        System.out.println("Please make your choice of pokemon to attack");
        for (Pokemon p : pokemons) {
            System.out.println(p.getFood());
        }
        String pokemon = speler_A.nextLine();
        return selectPokemon(pokemon, trainer);
    }

    @Override
    public int randomAttackByGymOwner(){
        Random rand = new Random();
        int maxAttacks = 4;
        return rand.nextInt(maxAttacks);
    }

    @Override
    public String chooseAttackPlayer(Pokemon p){
        Scanner speler_A = new Scanner(System.in);
        String type = p.getType();
        switch (type) {
            case "fire" -> {
                FirePokemon fp = (FirePokemon) p;
                System.out.println("Choose your attack");
                System.out.println(fp.getAttacks());
                return speler_A.nextLine();
            }
            case "water" -> {
                WaterPokemon wp = (WaterPokemon) p;
                System.out.println("Choose your attack");
                System.out.println(wp.getAttacks());
                return speler_A.nextLine();
            }
            case "electric" -> {
                ElectricPokemon ep = (ElectricPokemon) p;
                System.out.println("Choose your attack");
                System.out.println(ep.getAttacks());
                return speler_A.nextLine();
            }
            default -> {
                GrassPokemon gp = (GrassPokemon) p;
                System.out.println("Choose your attack");
                System.out.println(gp.getAttacks());
                return speler_A.nextLine();
            }
        }
    }

    @Override
    public void performAttackPlayer(Pokemon trianerPokemon, Pokemon gymPokemon, String attack){

        //
        // IMPORTANT: There are only four specific moves allowed PER POKÉMON TYPE!
        // Implement just those, within each type subclass.
        // Each one is a String in a list and has an associated method.
        //

        FirePokemon fire;
        ElectricPokemon electric;
        GrassPokemon grass;
        WaterPokemon water;

        String chosenAttack = attack.toLowerCase(Locale.ROOT);

        switch (trianerPokemon.getType()) {
            case "fire" -> {
                fire = new FirePokemon(trianerPokemon.getFood(), trianerPokemon.getLevel(), trianerPokemon.getHp(), trianerPokemon.getFood(), trianerPokemon.getSound());
                switch (chosenAttack) {
                    case "inferno" -> fire.inferno(trianerPokemon, gymPokemon);
                    case "pyroball" -> fire.pyroBall(trianerPokemon, gymPokemon);

                    // ^^^^ Is this a typo??? shouldn't it be camelcase like in the switch later on??

                    case "firelash" -> fire.fireLash(trianerPokemon, gymPokemon);
                    default -> fire.flameThrower(trianerPokemon, gymPokemon);
                }
            }
            case "water" -> {
                water = new WaterPokemon(trianerPokemon.getFood(), trianerPokemon.getLevel(), trianerPokemon.getHp(), trianerPokemon.getFood(), trianerPokemon.getSound());
                switch (chosenAttack) {
                    case "surf" -> water.surf(trianerPokemon, gymPokemon);
                    case "hydropump" -> water.hydroPump(trianerPokemon, gymPokemon);
                    case "hydrocanon" -> water.hydroCanon(trianerPokemon, gymPokemon);
                    default -> water.rainDance(trianerPokemon, gymPokemon);
                }
            }
            case "grass" -> {
                grass = new GrassPokemon(trianerPokemon.getFood(), trianerPokemon.getLevel(), trianerPokemon.getHp(), trianerPokemon.getFood(), trianerPokemon.getSound());
                switch (chosenAttack) {
                    case "leafstorm" -> grass.leafStorm(trianerPokemon, gymPokemon);
                    case "solarbeam" -> grass.solarBeam(trianerPokemon, gymPokemon);
                    case "leechseed" -> grass.leechSeed(trianerPokemon, gymPokemon);
                    default -> grass.leafBlade(trianerPokemon, gymPokemon);
                }
            }
            default -> {
                electric = new ElectricPokemon(trianerPokemon.getFood(), trianerPokemon.getLevel(), trianerPokemon.getHp(), trianerPokemon.getFood(), trianerPokemon.getSound());
                switch (chosenAttack) {
                    case "thunderpunch" -> electric.thunderPunch(trianerPokemon, gymPokemon);
                    case "electroball" -> electric.electroBall(trianerPokemon, gymPokemon);
                    case "thunder" -> electric.thunder(trianerPokemon, gymPokemon);
                    default -> electric.voltTackle(trianerPokemon, gymPokemon);
                }
            }
        }
    }

    @Override
    public void gymOwnerAttacks(Pokemon gymPokemon, Pokemon pokemon){
        FirePokemon fire;
        ElectricPokemon electric;
        GrassPokemon grass;
        WaterPokemon water;

        switch (gymPokemon.getType()) {
            case "fire" -> {
                fire = new FirePokemon(gymPokemon.getFood(), gymPokemon.getLevel(), gymPokemon.getHp(), gymPokemon.getFood(), gymPokemon.getSound());

                // Pokemon.getAttacks() returns a List object.

                String attack = fire.getAttacks().get(randomAttackByGymOwner());
                switch (attack) {
                    case "inferno" -> fire.inferno(gymPokemon, pokemon);
                    case "pyroBall" -> fire.pyroBall(gymPokemon, pokemon);

                    // ^^^^ Is this a typo??? should it be camelcase, or lower case like in the switch earlier??

                    case "fireLash" -> fire.fireLash(gymPokemon, pokemon);
                    default -> fire.flameThrower(gymPokemon, pokemon);
                }
            }
            case "water" -> {
                water = new WaterPokemon(gymPokemon.getFood(), gymPokemon.getLevel(), gymPokemon.getHp(), gymPokemon.getFood(), gymPokemon.getSound());
                String attack = water.getAttacks().get(randomAttackByGymOwner());
                switch (attack) {
                    case "surf" -> water.surf(gymPokemon, pokemon);
                    case "hydroPump" -> water.hydroPump(gymPokemon, pokemon);
                    case "hydroCanon" -> water.hydroCanon(gymPokemon, pokemon);
                    default -> water.rainDance(gymPokemon, pokemon);
                }
            }
            case "grass" -> {
                grass = new GrassPokemon(gymPokemon.getFood(), gymPokemon.getLevel(), gymPokemon.getHp(), gymPokemon.getFood(), gymPokemon.getSound());
                String attack = grass.getAttacks().get(randomAttackByGymOwner());
                switch (attack) {
                    case "leafStorm" -> grass.leafStorm(gymPokemon, pokemon);
                    case "solarBeam" -> grass.solarBeam(gymPokemon, pokemon);
                    case "leechSeed" -> grass.leechSeed(gymPokemon, pokemon);
                    default -> grass.leafBlade(gymPokemon, pokemon);
                }
            }
            default -> {
                electric = new ElectricPokemon(gymPokemon.getFood(), gymPokemon.getLevel(), gymPokemon.getHp(), gymPokemon.getFood(), gymPokemon.getSound());
                String attack = electric.getAttacks().get(randomAttackByGymOwner());
                switch (attack) {
                    case "thunderPunch" -> electric.thunderPunch(gymPokemon, pokemon);
                    case "electroBall" -> electric.electroBall(gymPokemon, pokemon);
                    case "thunder" -> electric.thunder(gymPokemon, pokemon);
                    default -> electric.voltTackle(gymPokemon, pokemon);
                }
            }
        }
    }

    @Override
    public void attackOrChange(Pokemon trainerPokemon, Pokemon gymPokemon, PokemonTrainer trainer, PokemonGymOwner gymLeader){
        Scanner speler_A = new Scanner(System.in);

        System.out.println("Do you want to attack or change your pokemon?");
        System.out.println("Type a for attack or c for change");
        String choice = speler_A.nextLine();

        if (choice.equalsIgnoreCase("a")) {
            String attack = chooseAttackPlayer(trainerPokemon); // Get the desired attack as a string.
            performAttackPlayer(trainerPokemon, gymPokemon, attack); // [trainerPokemon] does [attack] to [gymPokemon]
        } else {
            trainerPokemon = choosePokemon(trainer); // Player chose to switch Pokemon. Now select which one.
            attackOrChange(trainerPokemon, gymPokemon, trainer, gymLeader); // Will [trainer] attack [gymLeader]'s [gymPokemon] with [trainerPokemon], or switch Pokemon?
            fightRound(trainer, gymLeader, trainerPokemon, gymPokemon); // Go to the next round of the fight.
        }
    }

}
