package Tugas3;
import java.util.Scanner;

public class ipkmahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("input angka: ");
        int angka = input.nextInt();

        double index = 0.0;
        String huruf = "";

        if(angka >= 0 && angka <= 100) {
            if(angka >= 90) {
                index = 4.0;
                huruf = "A";
            } else if (angka >= 80) {
                index = 3.0;
                huruf = "B";
            } else if (angka >= 70) {
                index = 2.0;
                huruf = "C";
            } else if (angka >= 60) {
                index = 1.0;
                huruf = "D";
            } else if (angka >= 50) {
                index = 0.0;
                huruf = "E";
            }

            System.out.println("Nilai huruf: " + huruf);
            System.out.println("Nilai index: " + index);
        } else {
            System.out.println("angka yang di masukkan tidak valid!");
        }
    }
}
