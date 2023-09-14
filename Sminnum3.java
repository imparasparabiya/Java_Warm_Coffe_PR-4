import java.util.Scanner;

public class Sminnum3 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Value A = ");
        a = sc.nextInt();
        System.out.print("Enter Value B = ");
        b = sc.nextInt();
        System.out.print("Enter Value C = ");
        c = sc.nextInt();
        if (a < b) {
            if (a < c) {
                System.out.println(a + " is Big");
            } else {
                System.out.println(c + " is Big");
            }

        } else {
            if (b < c) {
                System.out.println(b + " is Big");
            } else {
                System.out.println(c + " is Big");
            }
        }
    }
}
