import java.util.Scanner;

public class Smaxnum {
    public static void main(String[] args) {
        int a, b;

        Scanner s = new Scanner(System.in);

        System.out.print("Enter Value A = ");
        a = s.nextInt();
        System.out.print("Enter Value B = ");
        b = s.nextInt();

        if (a > b) {
            System.out.println("A is Big");
        } else {
            System.out.println("B is Big");
        }

    }
}
