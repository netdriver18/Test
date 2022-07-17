package module3.homeTask_4_Anonymous.InnerClasses;

public class Main {
    public static void main(String[] args) {
        CPU cpu = new CPU(2000);
        CPU.Processor processor = cpu.new Processor();

        processor.setCores(16);
        processor.setManufacturer("Intel Core");

        CPU.RAM ram = cpu.new RAM();

        ram.setManufacturer("Gigabyte");
        ram.setMemory(16.5);

        System.out.println("" + cpu + " " + processor + " " + ram);
    }
}
