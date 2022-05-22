package HomeTask1.Robot;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args){
        Robot robot = new Robot();
        //robot.work();
        CoffeRobot coffeRobot = new CoffeRobot();
        //coffeRobot.work();
        RobotDancer robotDancer = new RobotDancer();
       //robotDancer.work();
        RobotCoocker robotCoocker = new RobotCoocker();
        //robotCoocker.work();
        List<Robot> robots = new ArrayList<Robot>();
        robots.add(coffeRobot);
        robots.add(robotCoocker);
        robots.add(robotDancer);




        //Robot[] robots = new Robot[4];
        //robots[0] = robot;
        //robots[1] = coffeRobot;
        //robots[2] = robotCoocker;
        //robots[3] = robotDancer;

        for (int i = 0; i < robots.size(); i++) {
            robots.get(i).work();

        }



    }
}
