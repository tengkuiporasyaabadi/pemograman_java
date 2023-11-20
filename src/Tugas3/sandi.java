package Tugas3;
import java.util.Scanner;
public class sandi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Mengatur sandi handphone
        String sandiDefault = "1234";
        String sandiInput;

        System.out.print("Masukkan sandi handphone: ");
        sandiInput = input.nextLine();

        if (sandiInput.equals(sandiDefault)) {
            System.out.println("Sandi benar. Selamat datang!");
        } else {
            System.out.println("Sandi salah. Akses ditolak.");
        }
    }

}
