import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Deck deck=new Deck();
        Warrior warrior=new Warrior();
        Archer archer =new Archer();
        Healer healer=new Healer();

        warrior.setValue(4);
        warrior.setAttackValue(1);
        warrior.setHealValue(0);

        archer.setValue(3);
        archer.setAttackValue(2);
        archer.setHealValue(0);

        healer.setValue(2);
        healer.setAttackValue(0);
        healer.setHealValue(2);

        System.out.println("your deck is:");
        System.out.println(" ");
        System.out.println(deck.getDeck());
        System.out.println(" ");
        Enemy enemy=new Enemy();
        enemy.setValue(5);
        Scanner input=new Scanner(System.in);
        int a = deck.getWarriorNumber();
        int b = deck.getArcherNumber();
        int c = deck.getHealerNumber();
        int x=a;
        int y=b;
        int z=c;
        int OverallHealth=deck.getWarriorNumber()* warrior.getValue()+ deck.getArcherNumber()* archer.getValue()+ deck.getHealerNumber()* healer.getValue();
        do{
            System.out.println("Enemy Health is "+enemy.getValue());
            System.out.println("your overall Health is "+OverallHealth);
            System.out.println(" ");
            System.out.println("your deck is:");
            System.out.println(" ");
            System.out.println(deck.getDeck());
            System.out.println(" ");
            System.out.println("choose which card you want to play from 1 to "+deck.getDeck().size());
            int in = input.nextInt();
            deck.getDeck().remove(in-1);
            if (in<=x){

                x=a-1;
            } else if (in<=y) {

                y=b-1;
            }
            else {

                z=c-1;
            }
            enemy.setValue(enemy.getValue()-((a-x)* warrior.getAttackValue()));
            enemy.setValue(enemy.getValue()-((b-y)* archer.getAttackValue()));
            OverallHealth=OverallHealth+(z-c)* healer.getHealValue();
        }while (enemy.getValue()>0);
    }
}
