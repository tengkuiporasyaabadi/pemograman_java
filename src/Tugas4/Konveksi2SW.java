package Tugas4;
import java.util.Scanner;
public class Konveksi2SW {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input angka: ");
        double nilaiAngka = input.nextDouble();

        String nilaiHuruf;

        if (nilaiAngka >= 0 && nilaiAngka <= 100) {
            int nilaiIndex = (int) (nilaiAngka / 10);

            switch (nilaiIndex) {
                case 10:
                case 9:
                    nilaiHuruf = "A";
                    break;
                case 8:
                    nilaiHuruf = "B";
                    break;
                case 7:
                    nilaiHuruf = "C";
                    break;
                case 6:
                    nilaiHuruf = "D";
                    break;
                default:
                    nilaiHuruf = "E";
                    break;
            }

            System.out.println("Nilai huruf:"+ nilaiHuruf);
        } else {
            System.out.println("Angka yang diinput tidak valid.");
        }
    }
}
