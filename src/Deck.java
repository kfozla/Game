import java.util.ArrayList;
import java.util.Scanner;

public class Deck {
    private static int WarriorNumber;
    private static int OverallResource;
    private static int ArcherNumber;
    private static int HealerNumber;
    private ArrayList<String> Deck = new ArrayList<String>();
    public Deck(){
        OverallResource=20;
        Scanner input = new Scanner(System.in);
        System.out.println("you have 20 resources:");

        System.out.println("how many warriors you want to put on your deck");
        WarriorNumber = input.nextInt();

        OverallResource = OverallResource - WarriorNumber*4;

        System.out.println("how many archers you want to put on your deck");
        ArcherNumber =input.nextInt();

        OverallResource=OverallResource-ArcherNumber*5;

        System.out.println("how many healers you want to put on your deck");
        HealerNumber =input.nextInt();

        OverallResource=OverallResource-HealerNumber*3;

        if(OverallResource<0){
            System.out.println("don't have enough resources for that");
            new Deck();
        }
        for (int i=0;i<WarriorNumber;i++){
            String name = "Warrior"+String.valueOf(i+1);
            Deck.add(name);
        }
        for (int i=0;i< ArcherNumber;i++){
            String name = "Archer"+String.valueOf(i+1);
            Deck.add(name);
        }
        for (int i=0;i< HealerNumber;i++){
            String name = "Healer"+String.valueOf(i+1);
            Deck.add(name);
        }
        System.out.println("Deck created successfully you have "+WarriorNumber+" Warriors "+ArcherNumber+" Archers and "+HealerNumber+" Healers");
    }

    public int getWarriorNumber(){
        return WarriorNumber;
    }
    public int getArcherNumber(){
        return ArcherNumber;
    }
    public int getHealerNumber(){
        return ArcherNumber;
    }
    public ArrayList getDeck(){
        return Deck;
    }
}
