import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args ){
        //Make a scanner to get user guesses
        Scanner scan = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = scan.nextLine();

        if (name.equals("Alice") || name.equals("Bob")){
            System.out.println("Hello " + name + " welcome!");
        }
        else {
            System.out.println("Goodbye");
        }
    }
}
