abstract class Card {
    private int resource;
    private int value;
    private int shield;
    private int AttackValue;
    private int HealValue;
    public int getAttackValue(){
        return AttackValue;
    }
    public void setAttackValue(int x){
        AttackValue=x;
    }
    public int getHealValue(){
        return HealValue;
    }
    public void setHealValue(int x){
        HealValue=x;
    }

    public int getResource(){
    return resource;
    }
    public void setResource(int x){
        resource=x;
    }
    public int getValue() {
        return value;
    }
    public void setValue(int x){
        value=x;
    }
    public int getShield(){
        return shield;
    }
    public void setShield(int x){
        shield=x;
    }
    public abstract void Attack();
    public abstract void Heal();

}
