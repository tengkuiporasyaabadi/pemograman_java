package Tugas5;

public class for1 {
    public static void main(String[] args) {
        String[] menu = {"milo", "kopi", "teh", "susu", "jus"};

        System.out.println("menu:");
        for (int i = 0; i < menu.length; i++) {
            System.out.println("harike-"+(i + 1) + ". " + menu[i]);
        }
    }
}
