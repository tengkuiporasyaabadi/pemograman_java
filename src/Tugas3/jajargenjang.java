package Tugas3;
import java.util.Scanner;
public class jajargenjang {
    public  static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan panjang alas: ");
        double alas = input.nextDouble();

        System.out.println("Masukkan tinggi: ");
        double tinggi = input.nextDouble();

        System.out.println("Masukkan panjang sisi: ");
        double sisi = input.nextDouble();

        double luas = alas * tinggi;
        double keliling = 2 * (alas + sisi);

        System.out.println("Luas jajar genjang: " + luas);
        System.out.println("Keliling jajar genjang: " + keliling);
    }
}
