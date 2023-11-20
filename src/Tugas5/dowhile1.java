package Tugas5;

public class dowhile1 {
    public static void main(String[] args) {
        String[] menu = {"kopi", "susu", "teh", "milo", "jus"};
        int i = 0;

        System.out.println("menu:");
        do {
            System.out.println("harike-"+(i + 1) + ". " + menu[i]);
            i++;
        } while (i < menu.length);
    }
}
