import java.util.Scanner;

abstract class Healer extends Card{
    @Override
    public void Heal(){
        setValue(getValue()+1);
    }

}
