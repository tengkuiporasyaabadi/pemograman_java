package Tugas4;
import java.util.Scanner;

public class konveksi1IF {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("input angka: ");
        int angka = input.nextInt();

        double index = 0.0;


        if(angka >= 0 && angka <= 100) {
            if(angka >= 80) {
                index = 4.0;

                System.out.println("Nilai index: " + index);
            } else {
                System.out.println("angka yang di masukkan tidak valid!");
            }
        }
    }
}
