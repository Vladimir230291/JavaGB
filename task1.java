import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int res = 0;
        System.out.print("Введите число: ");

        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            sc.close();

            if (n < 0) n *= -1;
            for (int i = 1; i <= n; i++) {
                res += i;
                System.out.printf("%d ", res);
            }
        } else System.out.println("Введите число!");
    }
}
