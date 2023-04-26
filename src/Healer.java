import java.util.Scanner;

public class Healer extends Card{
    public Healer(){
        Scanner input = new Scanner(System.in);
        System.out.println("choose a friend to heal from left to right 1 to 3");
        int HealValue = input.nextInt();
    }
}
