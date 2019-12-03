package OOP.encapsulation;

public class Main {

    public static void main(String[] args) {

        Player player = new Player("Zeus", "thunder");
        System.out.println(player.getHealth());

        player.loseHealth(77);
        System.out.println(player.getHealth());
    }
}
