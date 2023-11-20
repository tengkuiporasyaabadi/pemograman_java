package Tugas2;
import static java.lang.System.out;
import java.util.Scanner;
public class authenticator2 {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        out.print("Username: ");
        String username = keyboard.next ();

        if (username.equals("bburd") ) {
            out.print("password: ");
            String password = keyboard.next ();

            if (password.equals("swordfish") ) {
                out.println("You're In");
            } else {
                out.println("Incorrect Password");
            }
        } else {
            out.println("Unknown User");
        }

        keyboard.close();
    }

}
