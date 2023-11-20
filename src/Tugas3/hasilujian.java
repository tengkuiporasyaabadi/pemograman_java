package Tugas3;
import java.util.Scanner;
public class hasilujian {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Masukkan nilai ujian: ");
            int nilai = input.nextInt();

            if (nilai >= 90) {
                System.out.println("Selamat! Kamu lulus dengan nilai A!");
            } else if (nilai >= 80) {
                System.out.println("Selamat! Kamu lulus dengan nilai B!");
            } else if (nilai >= 70) {
                System.out.println("Selamat! Kamu lulus dengan nilai C!");
            } else if (nilai >= 60) {
                System.out.println("Kamu lulus dengan nilai D, perlu lebih banyak belajar lagi!");
            } else {
                System.out.println("Maaf, kamu tidak lulus ujian. Tingkatkan belajarmu dan coba lagi!");
            }
        }
}
