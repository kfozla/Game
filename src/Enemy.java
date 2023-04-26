public class Enemy extends Card{
    @Override
    public void Heal(){
        setValue(getValue()+getHealValue());
    }
    @Override
    public void Attack(){

    }
}
