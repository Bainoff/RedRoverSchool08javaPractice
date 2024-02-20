package homework.HW08;

public class Kata {
    //TODO https://www.codewars.com/kata/two-fighters-one-winner/java
    public static String str = "";
    public static String attack(Fighter fighter1, Fighter fighter2) {
        str = "\n" + fighter1.name + " attacks " + fighter2.name + "; " + fighter2.name + " now has " + (fighter2.health -= fighter1.damagePerAttack) + " health.";
    return str;
    }

    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        boolean attackFirst = firstAttacker.equals(fighter1.name);

        while (fighter1.health > 0 && fighter2.health > 0) {
            if (attackFirst) {
                str += attack(fighter1, fighter2);
            } else {
                str += attack(fighter2, fighter1);
            }
            attackFirst = !attackFirst;
        }

        if (fighter1.health <= 0) {
            return str.substring(0, str.length()-1) + " and is dead. " + fighter2.name + " wins.";
        } else {
            return str.substring(0, str.length()-1) + " and is dead. " + fighter1.name + " wins.";
        }
    }
}