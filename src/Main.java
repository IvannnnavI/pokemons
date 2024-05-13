import java.util.*;

public class Main {
    public static void main(String[] args) {
        Battle battle = new Battle();
//        Random random = new Random();
//
//        Cottonee cottonee = new Cottonee();
//        Scizor scizor = new Scizor();
//        Pokemon[] pokemons = {
//                new Cottonee(),
//                new Passimian(),
//                new Scizor(),
//                new Scyther(),
//                new Whimsicott()
//        };
//
//        ArrayList<Pokemon> pokemonList = new ArrayList<Pokemon>;
//        Collections.shuffle(pokemonList);
//        battle.addLeftTeam(pokemonList.get(0));
//        battle.addLeftTeam(pokemonList.get(1));
//        battle.addLeftTeam(pokemonList.get(2));
//        battle.addRightTeam(pokemonList.get(3));
//        battle.addRightTeam(pokemonList.get(4));
//        battle.addRightTeam(pokemonList.get(5));
//
//        battle.go1vs1(cottonee, scizor);

        Pokemons pokemons = new Pokemons();

        ArrayList<Pokemon>[] teams = pokemons.pokemonsList();

        ArrayList<Pokemon> pokemonsTeam1 = teams[0];
        ArrayList<Pokemon> pokemonsTeam2 = teams[1];

        System.out.println("Команда 1:");
        for (Pokemon pokemon : pokemonsTeam1) {
            System.out.println(pokemon.getName());
        }

        System.out.println("Команда 2:");
        for (Pokemon pokemon : pokemonsTeam2) {
            System.out.println(pokemon.getName());
        }

        battle.goTeams(pokemonsTeam1, pokemonsTeam2);



    }





}
