package module2.homeTask2.salary;

public class Worker_hour implements Salary{
    public double salary = 0;
    public Double DigitSalary(){
        this.salary = 21*300.22;
        return salary;
    }

    public void ShowSalary(){
        System.out.println("Зарплатня працівника почасового складає :"+this.salary);
    }
}
