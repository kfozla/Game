public class Main {
    public static void main(String[] args) {
        Deck deck=new Deck();
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
