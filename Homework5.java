class Computer{
    private String cpu;
    private String memory;
    private String hdd;
    private String color;
    private String power;

    Computer(String cpu, //생성자
             String memory,
             String hdd,
             String color,
             String power){
        this.cpu = cpu;
        this.memory = memory;
        this.hdd = hdd;
        this.color = color;
        this.power = power;
    }
    public void turnOn(){
        System.out.println("Turning on the Computer...");
    }
    public void printInfo(){
        System.out.println("The spec of the Computer");
        System.out.println("CPU : " + cpu);
        System.out.println("Memory :" + memory);
        System.out.println("HDD : " + hdd);
        System.out.println("Color : " + color);
        System.out.println("Power : " + power);
    }
}
class Monitor{
    private String monitorSize;
    private String color;
    private String power;

    Monitor(String monitorSize,
            String color,
            String power){
        this.monitorSize = monitorSize;
        this.color = color;
        this.power = power;
    }
    public void turnOn(){
        System.out.println("Turning on the Monitor...");
    }
    public void printInfo(){
        System.out.println("The spec of the Monitor");
        System.out.println("Monitor Size : " + monitorSize);
        System.out.println("Color : " + color);
        System.out.println("Power : " + power);
    }
}
class PersonalComputer{
    Computer computer = new Computer("Core i7",
            "16GB",
            "2TB",
            "White",
            "500W");
    Monitor monitor = new Monitor("24inch",
            "Black",
            "45W");
    public void turnOn(){
        computer.turnOn();
        monitor.turnOn();
    }
    public void printPcInfo(){
        computer.printInfo();
        monitor.printInfo();
    }
}
public class Homework5 {
    public static void main(String[] args){
        PersonalComputer pc = new PersonalComputer();

        pc.turnOn();
        pc.printPcInfo();
    }
}
