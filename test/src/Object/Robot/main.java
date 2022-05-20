package Object.Robot;

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

        Robot[] robots = new Robot[4];
        robots[0] = robot;
        robots[1] = coffeRobot;
        robots[2] = robotCoocker;
        robots[3] = robotDancer;

        for (int i = 0; i < robots.length; i++) {
            robots[i].work();

        }



    }
}
