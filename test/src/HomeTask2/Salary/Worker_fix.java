package HomeTask2.Salary;

public class Worker_fix implements Salary{
    public double salary = 0;
    public Double DigitSalary(){
        this.salary = 4500.20;
        return salary;
    }

    public void ShowSalary(){
        System.out.println("Зарплатня працівника фіксованого складає :"+this.salary);
    }
}
