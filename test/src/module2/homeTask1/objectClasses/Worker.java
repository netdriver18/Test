package module2.homeTask1.objectClasses;
public class Worker {
   private int age;
   private String name;
  // private String position;

  public Worker(String name){
       this.name = name;
  }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}

