package module2.homeTask1.robot;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args){
        Robot robot = new Robot();

        CoffeRobot coffeRobot = new CoffeRobot();

        RobotDancer robotDancer = new RobotDancer();

        RobotCoocker robotCoocker = new RobotCoocker();

        List<Robot> robots = new ArrayList<>();
        robots.add(coffeRobot);
        robots.add(robotCoocker);
        robots.add(robotDancer);


        for (int i = 0; i < robots.size(); i++) {
            robots.get(i).work();

        }



    }
}
