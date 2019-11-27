package methods.overloadingMethods;

public class OverloadingMethods {

    public static void main(String[] args) {

        int fullPlayerHealth = 100;
        System.out.println("Full player health: " + fullPlayerHealth);

        int playerHealthAfterFirstAttack = attack(fullPlayerHealth, 20);
        System.out.println(playerHealthAfterFirstAttack);

        int playerHealthAfterSeconfAttack = attack(playerHealthAfterFirstAttack, 30, 10);
        System.out.println(playerHealthAfterSeconfAttack);

        //--------------------------------------------------------------------------------------------------------

        double test = attack(fullPlayerHealth, 70);
        System.out.println(test);

    }

    public static int attack(int playerHealth, int firstDamage){
        playerHealth -= firstDamage;
        System.out.println("Health after first attack: " + playerHealth);
        return playerHealth;
    }

    public static int attack(int damageHealth, int secondDamage, int bonusDamage){
        damageHealth -= secondDamage - bonusDamage;
        System.out.println("Health after second attack with bonus damage: " + damageHealth);
        return damageHealth;
    }

    //-------------------------------------------------------------------------------------------------------------

    public static double attack(double hea, double dam){
        hea -= dam;
        System.out.println("Health after test attack: " + hea);
        return hea;
    }
}
