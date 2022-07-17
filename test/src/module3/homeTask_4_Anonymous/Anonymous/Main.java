package module3.homeTask_4_Anonymous.Anonymous;

public class Main {
    public static void main(String[] args) {

        Car carObjectPetrol = new Car("Petrol");
        CarWorkMonitor carWorkMonitorPetrol = new CarWorkMonitor() {
            @Override
            public void startWork() {
                System.out.println("Work petrol engine......" + carObjectPetrol.toString());
            }
        };
        Car carObjectDiesel = new Car("Diesel");
        CarWorkMonitor carWorkMonitorDiesel = new CarWorkMonitor() {
            @Override
            public void startWork() {
                System.out.println("Work diesel engine......" + carObjectDiesel.toString());
            }
        };
        Car carObjectElectro = new Car("Electro");
        CarWorkMonitor carWorkMonitorElectro = new CarWorkMonitor() {
            @Override
            public void startWork() {
                System.out.println("Work electro engine......" + carObjectElectro.toString());
            }
        };

        carWorkMonitorPetrol.startWork();
        carWorkMonitorDiesel.startWork();
        carWorkMonitorElectro.startWork();
    }
}
