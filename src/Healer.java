import java.util.Scanner;

public class Healer extends Card{
    @Override
    public void Attack() {

    }

    @Override
    public void Heal(){
        setValue(getValue()+1);
    }

}
