public class Main {
    public static void main(String[] args) {
        Deck deck=new Deck();
        for (int i=0;i< deck.getWarriorNumber();i++){
            String name = "Warrior"+String.valueOf(i+1);
            deck.getDeck().add(name);
        }
        for (int i=0;i< deck.getArcherNumber();i++){
            String name = "Archer"+String.valueOf(i+1);
            deck.getDeck().add(name);
        }
        for (int i=0;i< deck.getHealerNumber();i++){
            String name = "Healer"+String.valueOf(i+1);
            deck.getDeck().add(name);
        }
        System.out.println(deck.getDeck());
        Enemy enemy=new Enemy();
        enemy.setValue(0);
        do{
            System.out.println("Enemy Health is "+enemy.getValue());
            System.out.println("your overall Health is ");

        }while (enemy.getValue()>0);
        enemy.setValue(5);
        enemy.setHealValue(2);
        System.out.println(enemy.getValue());
        enemy.Heal();
        System.out.println(enemy.getValue());
    }
}
