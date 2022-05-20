package ObjectRectangle;

public class Rectangle {
  public double s;
  public double p;

    public  Rectangle(double r, double d){
        s = (r*d);
        p = 2*(r+d);
     System.out.println("Площа прямокутника = "+s);
     System.out.println("Периметр прямокутника = "+p);
    }
    public  Rectangle(double r, double d, boolean color){

    }

    public  Rectangle(){

    }
}
