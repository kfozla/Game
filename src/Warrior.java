import java.util.Scanner;

public class Warrior extends Card{
    public Warrior(){
        Scanner input = new Scanner(System.in);
        System.out.println("choose an enemy to attack from left to right 1 to 3");
        int AttackValue = input.nextInt();

    }

}
