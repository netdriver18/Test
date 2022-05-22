package HomeTask2.Flower;

public class Main {
    public static void main(String[] args){
        double sumPrise = 0.0;
        Rose rose = new Rose();
        rose.setColor();
       // rose.getColor();
        rose.setPrice();
        rose.getPrice();

        Tulip tulip = new Tulip();
        tulip.setColor();
        //tulip.getColor();
        tulip.setPrice();
        tulip.getPrice();


        sumPrise =  tulip.price + rose.price;
        System.out.println("Букет з тюльпанів і роз коштує :"+sumPrise);
    }
}
