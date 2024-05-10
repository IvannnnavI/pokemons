import java.util.ArrayList;
import java.util.List;

public class Pokemons {


    private List<Pokemon> pokemonsTeam1;
    private List<Pokemon> pokemonsTeam2;


    public void pokemonsList() {

        Pokemon rotom = new Pokemon(1200, 18, 12, "Bite" ,"rotom");
        Pokemon scyther = new Pokemon(1800, 9, 16, "Confide" , "scyther");
        Pokemon scizor = new Pokemon(800, 43, 5, "Confide" ,"scizor");
        Pokemon igglybuff = new Pokemon(700, 54, 2, "Facade" , "igglybuff");
        Pokemon jigglypuff = new Pokemon(2000, 7, 20, "Iron Defense" , "jigglypuff");
        pokemonsTeam1.add(rotom);
        pokemonsTeam1.add(scyther);
        pokemonsTeam2.add(scizor);
        pokemonsTeam2.add(igglybuff);

    }

    public Pokemons() {
        this.pokemonsTeam1 = new ArrayList<>();
        this.pokemonsTeam2 = new ArrayList<>();
        pokemonsList();
    }


    public void figth() {





    }


}
