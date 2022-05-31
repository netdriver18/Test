package module2.homeTask2.car;

public class Main {

    public static void main(String[] args){
    Car car = new Car("sidan","Gas");
    car.print();

    Body body = new Body(10,"Coupe");
    body.print();

    SteeringWheel  steeringWheel = new SteeringWheel(7, "oval");
    steeringWheel.print();

    Wheel wheel = new Wheel(10, "Left");
    wheel.print();


}


}
