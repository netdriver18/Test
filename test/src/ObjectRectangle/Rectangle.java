package ObjectRectangle;

public class Rectangle {
  public double s,p,a,b;

    public  Rectangle(double r, double d){

        this.a = r;
        this.b = d;

    }
    public  Rectangle(double r, double d, boolean color){

    }

    public void Plosha(){
        this.s = this.a*this.b;
        System.out.println("Площа прямокутника = "+this.s);
    }

    public void Perimetr(){
        this.p = 2*(this.a+this.b);
        System.out.println("Периметр прямокутника = "+p);
    }

    public  Rectangle(){

    }
}
