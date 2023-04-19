public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    double dodge;

    public Fighter (String name, int damage, int health, int weight, double dodge){
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.dodge = dodge;
    }

    public int hit (Fighter foe){
        System.out.println(this.name + " attacked to " + foe.name + " by damage " + this.damage );
        if (foe.dodge()){
            System.out.println(foe.name + " dodged the damage.");
            return foe.health;
        }
        if (foe.health - this.damage < 0){
            return 0;
        }
        return foe.health - this.damage;
    }

    public boolean dodge (){
        double randomvalue = Math.random() * 100;
        return randomvalue <= this.dodge;
    }
}
