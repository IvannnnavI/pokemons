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
            System.out.println("Теперь у покемона" + right + right.getHP());
            left.sleep(left);
            right.fight(left);
            right.sleep(right);
            if (left.getHP() < 0) {
                System.out.println("Победил покемон" + right.getName());

            } else {
                System.out.println("ПОбедил покемон" + left.getName());
            }
        }

    }

}









