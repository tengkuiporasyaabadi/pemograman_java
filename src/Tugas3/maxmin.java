package Tugas3;
import java.util.Scanner;
public class maxmin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Max: ");
        int max = scanner.nextInt();

        System.out.print("Masukkan Min: ");
        int min = scanner.nextInt();

        System.out.print("Masukkan Interval: ");
        int interval = scanner.nextInt();

        if ((max - min) % interval == 0) {
            int n = (max - min) / interval;
            int i = 1;
            int sum = 0;

            while (i <= n) {
                sum =  sum + min;
                min = min + interval;
                i = i + 1;
            }

            System.out.println("Total Sum: " + sum);
        } else {
            System.out.println("Sum tidak bisa dihitung");
        }
    }
}
