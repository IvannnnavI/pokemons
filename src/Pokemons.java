import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Pokemons {


    private ArrayList<Pokemon> pokemonsTeam1;
    private ArrayList<Pokemon> pokemonsTeam2;


//    public void pokemonsList() {

//        Pokemon rotom = new Pokemon(1200, 18, 12, "Bite" ,"rotom");
//        Pokemon scyther = new Pokemon(1800, 9, 16, "Confide" , "scyther");
//        Pokemon scizor = new Pokemon(800, 43, 5, "Confide" ,"scizor");
//        Pokemon igglybuff = new Pokemon(700, 54, 2, "Facade" , "igglybuff");
//        Pokemon jigglypuff = new Pokemon(2000, 7, 20, "Iron Defense" , "jigglypuff");
//        pokemonsTeam1.add(rotom);
//        pokemonsTeam1.add(scyther);
//        pokemonsTeam2.add(scizor);
//        pokemonsTeam2.add(igglybuff);

    public ArrayList<Pokemon>[] pokemonsList() {

        ArrayList<Pokemon> pokemonsTeam1 = new ArrayList<>();
        ArrayList<Pokemon> pokemonsTeam2 = new ArrayList<>();

        ArrayList<Pokemon> availablePokemons = new ArrayList<>();
        availablePokemons.add(new Cottonee());
        availablePokemons.add(new Scyther());
        availablePokemons.add(new Scizor());
        availablePokemons.add(new Igglybuff());
        availablePokemons.add(new Whimsicott());
        availablePokemons.add(new Passimian());

        Collections.shuffle(availablePokemons);

        for (int i = 0; i < 3; i++) {
            pokemonsTeam1.add(availablePokemons.get(i));
            pokemonsTeam2.add(availablePokemons.get(i + 3)); // Следующие 3 покемона идут во вторую команду
        }

        ArrayList<Pokemon>[] teams = new ArrayList[2];
        teams[0] = pokemonsTeam1;
        teams[1] = pokemonsTeam2;

        return teams;
    }

    public Pokemons() {
        this.pokemonsTeam1 = new ArrayList<>();
        this.pokemonsTeam2 = new ArrayList<>();
        pokemonsList();
    }


    public void figth() {
    }


}
