package Tugas5;

public class while1 {
    public static void main(String[] args) {
        String[] menu = {"milo", "kopi", "susu", "teh", "jus"};
        int i = 0;

        System.out.println("menu:");
        while (i < menu.length) {
            System.out.println("harike-"+(i + 1) + ". " + menu[i]);
            i++;
        }
    }
}
