package OOP.encapsulation;

public class Player {

    private String name;
    private int health = 100;
    private String weapon;

    public Player(String name, String weapon) {
        this.name = name;
        this.weapon = weapon;
    }

    public void loseHealth(int damage){
        this.health -= damage;
        if(this.health <= 0)
            System.out.println("Player knocked out");
    }

    public int getHealth(){
        return health;
    }
}
