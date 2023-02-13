package OOP_origin_lekc1.src;

import java.util.ArrayList;

public class Robot1 {
    enum State{
        ON,OFF
    }
    private static int defaultIndex;
    private static ArrayList<String> names;
    static {
        defaultIndex=1;
        names = new ArrayList<String>();
    }
    //    Уровень робота
    private int level;
    //    Имя робота
    private String name;
    private State state;

    /**
     * Создание робота
     *
     * @param name  Имя робота Не должно начинаться с цифры
     * @param level Уровень робота
     */
    private Robot1(String name,int level) {
        if((name.isEmpty()||Character.isDigit(name.charAt(0))
                || Robot1.names.contains(name))){
            this.name = String.format("DefaultName_%d",defaultIndex++);
        }else this.name = name;
        Robot1.names.add(this.name);
        this.level = 1;
        this.state = State.OFF;

    }
    public Robot1(String name){
        this(name,1);
    }
    public Robot1(){
        this("");
    }

    public int getLevel() {
        return level;
    }

    public String getName() {
        return name;
    }


    //    Методы включения и выключения систем
    private void powerON() {
        this.startBIOS();
        this.startOS();
        this.sayHI();
    }

    private void powerOff() {
        this.sayBay();
        this.stopOS();
        this.stopBIOS();
    }
    public void power(){
        if (this.state == State.OFF){
            this.powerON();
            this.state = State.ON;
        }else {
            this.powerOff();
            this.state = State.OFF;
        }
        System.out.println();
    }

    private void startBIOS() {
        System.out.println("Start BIOS");
    }

    private void startOS() {
        System.out.println("start OS");
    }

    private void sayHI() {
        System.out.println("Hello");
    }

    private void sayBay() {
        System.out.println("Good-Bay");
    }

    private void stopBIOS() {
        System.out.println("Stop BIOS");
    }

    private void stopOS() {
        System.out.println("stopOS");
    }

    public void work() {
        if(this.state == State.ON){
        System.out.println("Working...");
        }else System.out.println("power off...");
    }

    @Override
    public String toString() {
        return "Robot1{" +
                "level=" + level +
                ", name='" + name + '\'' +
                ", state=" + state +
                '}';
    }
}
