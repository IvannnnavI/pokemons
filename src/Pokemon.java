


abstract class Pokemon {

    private double HP;
    private double attack;

    private double defense;

    private String specialAttack;
    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Pokemon(double HP, double attack, double defense, String specialAttack, String name) {
        this.HP = HP;
        this.attack = attack;
        this.defense = defense;
        this.specialAttack = specialAttack;
        this.name = name;
    }

    public double getHP() {
        return HP;
    }

    public void setHP(double HP) {
        this.HP = HP;
    }

    public double getAttack() {
        return attack;
    }

    public void setAttack(double attack) {
        this.attack = attack;
    }

    public double getDefense() {
        return defense;
    }

    public void setDefense(double defense) {
        this.defense = defense;
    }

    public String getSpecialAttack() {
        return specialAttack;
    }

    public void setSpecialAttack(String specialAttack) {
        this.specialAttack = specialAttack;
    }


    public void fight(Pokemon opponent) {
        System.out.println(this.name + " нанес " + (this.attack - opponent.defense) + " урон");
        opponent.HP -= this.attack - opponent.defense;
        if (this.HP > opponent.HP) {
            System.out.println("Покемон " + this.name + " победил");
        } else {
            System.out.println("Покемон " + opponent.name + " победил");
        }
    }

    public void sleep(Pokemon pokemon) {
        this.HP *=1.1;
        System.out.println(this.name + "восстанавливает здоровье" + pokemon.getHP());
    }
}


