import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Battle {
    Random random = new Random();
    private List<Pokemon> pokemonsTeam1;
    private List<Pokemon> pokemonsTeam2;

    public Battle() {
        this.pokemonsTeam1 = new ArrayList<>();
        this.pokemonsTeam2 = new ArrayList<>();
    }

    public List<Pokemon> addLeftTeam(ArrayList<Pokemon> pokemons) {
        return pokemons;
    }


    public List<Pokemon> addRightTeam(ArrayList<Pokemon> pokemons) {
        return pokemons;
    }

    public void go1vs1(Pokemon left, Pokemon right) {
        System.out.println("Fight begin!!!!!!!!!!");

        while (left.getHP() > 0 && right.getHP() > 0) {
            left.fight(right);
            System.out.println("Теперь у покемона" + right.getName() + " " + right.getHP());
            left.sleep(left);
            right.fight(left);
            right.sleep(right);

        }

        if (left.getHP() < 0) {
            System.out.println("Победил покемон" + right.getName());

        } else {
            System.out.println("ПОбедил покемон" + left.getName());
        }

    }

    public void goTeams(ArrayList<Pokemon> pokemonsTeam1, ArrayList<Pokemon> pokemonsTeam2) {
        System.out.println("Fight begins!!!!!!!!!!");
        int numOfRounds = Math.min(pokemonsTeam1.size(), pokemonsTeam2.size());
        for (int i = 0; i < numOfRounds; i++) {
            Pokemon pokemon1 = pokemonsTeam1.get(i);
            Pokemon pokemon2 = pokemonsTeam2.get(i);

            while (pokemon1.getHP() > 0 && pokemon2.getHP() > 0) {
                pokemon1.fight(pokemon2);
                System.out.println("Теперь у покемона " + pokemon2.getName() + " " + pokemon2.getHP() + " здоровья.");
                pokemon2.fight(pokemon1);
                System.out.println("Теперь у покемона " + pokemon1.getName() + " " + pokemon1.getHP() + " здоровья.");
                pokemon1.sleep(pokemon1);
                pokemon2.sleep(pokemon2);
            }

            if (pokemon1.getHP() <= 0) {
                System.out.println("Покемон " + pokemon2.getName() + " побеждает!");
            } else if (pokemon2.getHP() <= 0) {
                System.out.println("Покемон " + pokemon1.getName() + " побеждает!");
            }
        }

        if (pokemonsTeam1.size() > pokemonsTeam2.size()) {
            System.out.println("Команда 1 побеждает!");
        } else if (pokemonsTeam2.size() > pokemonsTeam1.size()) {
            System.out.println("Команда 2 побеждает!");
        } else {
            System.out.println("Ничья!");
        }
    }

    public void addLeftTeam(Pokemon pokemon) {
    }
}









