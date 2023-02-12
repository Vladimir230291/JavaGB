public class Main {
    public static void main(String[] args) {
        Robot1 robot_1 = new Robot1();
        System.out.printf("%s - %d lvl created\n",robot_1.getName(),robot_1.getLevel());
        robot_1.power();
        robot_1.work();
        System.out.println("5 minets leter....");
        robot_1.power();


    }
}