import java.util.*;

public class Main {
    public static void main(String[] args) {
        Battle battle = new Battle();
        Random random = new Random();

        Cottonee cottonee = new Cottonee();
        Scizor scizor = new Scizor();
        Pokemon[] pokemons = {
                new Cottonee(),
                new Passimian(),
                new Scizor(),
                new Scyther(),
                new Whimsicott()
        };




        List<Pokemon> pokemonList =  Arrays.asList(pokemons);
        Collections.shuffle(pokemonList);
        // battle.addLeftTeam(pokemonList.get(0))
        // battle.addLeftTeam(pokemonList.get(1))
        // battle.addLeftTeam(pokemonList.get(2))
        // battle.addRightTeam(pokemonList.get(3))
        // battle.addRightTeam(pokemonList.get(4))
        // battle.addRightTeam(pokemonList.get(5))
        battle.go1vs1(cottonee, scizor);



    }





}
