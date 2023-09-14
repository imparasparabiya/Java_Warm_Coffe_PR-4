import java.util.Scanner;

public class Num {
    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Number = ");
        n = s.nextInt();
        if (n > 0) {
            System.out.println(n + "Number Is Positive");
        } else if (n == 0) {
            System.out.println(n + "Number Is Zero");
        } else {
            System.out.println(n + "Number Is Negetive");
        }

    }
}
