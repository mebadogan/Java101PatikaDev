public class Ring {
    Fighter first;
    Fighter second;
    int minWeight;
    int maxWeight;

    public Ring(Fighter first, Fighter second, int minWeight, int maxWeight){
        this.first = first;
        this.second = second;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public void run() {

        if (checkWeight()) {
            double prob = 0.5;
            Fighter temp;
            if(Math.random() < prob){
                temp = first;
                first = second;
                second = temp;
            }
            while (first.health > 0 && second.health > 0) {
                System.out.println("=========== NEW ROUND ===========");
                second.health = first.hit(second);
                if (isWin()){
                    break;
                }
                first.health = second.hit(first);
                if (isWin()){
                    break;
                }
                printScore();
            }

        } else {
            System.out.println("Fighters\' weight do not match.");
        }
    }
    public boolean checkWeight() {
        return (first.weight >= minWeight && first.weight <= maxWeight) && (second.weight >= minWeight && second.weight <= maxWeight);
    }
    public boolean isWin() {
        if (first.health == 0) {
            System.out.println("Maçı Kazanan : " + second.name);
            return true;
        } else if (second.health == 0){
            System.out.println("Maçı Kazanan : " + second.name);
            return true;
        }

        return false;
    }

    public void printScore() {
        System.out.println("------------");
        System.out.println(first.name + " Current health \t:" + first.health);
        System.out.println(second.name + " Current health \t:" + second.health);
    }
}
