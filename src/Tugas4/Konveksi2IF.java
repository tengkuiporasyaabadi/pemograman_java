package Tugas4;
import java.util.Scanner;
public class Konveksi2IF {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input angka: ");
        double Angka = input.nextDouble();

        String Huruf;

        if (Angka >= 80 && Angka <= 100) {
            Huruf = "A";
        }
        else if (Angka >= 70 && Angka < 80) {
            Huruf = "B";
        }
        else if (Angka >= 60 && Angka < 70) {
            Huruf = "C";
        }
        else if (Angka >= 50 && Angka < 60) {
            Huruf = "D";
        }
        else if (Angka >= 0 && Angka < 50) {
            Huruf = "E";
        }
        else {
            System.out.println("Angka yang input tidak valid!");
            return;
        }

        System.out.println("Nilai huruf:" + Huruf);
    }
}
