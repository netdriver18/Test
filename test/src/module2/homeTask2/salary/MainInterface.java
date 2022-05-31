package module2.homeTask2.salary;

public class MainInterface {
    public static void main(String[] args){
        Worker_fix work_fix = new Worker_fix();
        Worker_hour work_hour = new Worker_hour();
        work_fix.DigitSalary();
        work_fix.ShowSalary();
        work_hour.DigitSalary();
        work_hour.ShowSalary();
    }
}
