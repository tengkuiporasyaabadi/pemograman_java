package Tugas4;
import java.util.Scanner;

public class konveksi1SW {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input huruf:");
        String nilaiHuruf = input.nextLine();

        double nilaiIndex;

        switch (nilaiHuruf) {
            case "A":
                nilaiIndex = 4.0;
                break;
            case "B":
                nilaiIndex = 3.0;
                break;
            case "C":
                nilaiIndex = 2.0;
                break;
            case "D":
                nilaiIndex = 1.0;
                break;
            case "E":
                nilaiIndex = 0;
                break;
            default:
                System.out.println("Nilai huruf  tidak valid.");
                return;
        }

        System.out.println("Nilai indeks : "+ nilaiIndex);
    }
}
