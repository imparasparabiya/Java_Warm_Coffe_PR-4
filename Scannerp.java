import java.util.Scanner;

public class Scannerp {
    public static void main(String[] args) {
        int a, b, c;
        float d, e, f;
        String name, surname, fullname;
        char ch;
        Scanner s = new Scanner(System.in);
        System.out.println("Scanner With Int Data Type");
        System.out.print("Enter Value A = ");
        a = s.nextInt();
        System.out.print("Enter Value B = ");
        b = s.nextInt();
        c = a + b;
        System.out.println("Sum A + B = " + c);
        System.out.println("Scanner With Float Data Type");
        System.out.print("Enter Vlaue D = ");
        d = s.nextFloat();
        System.out.print("Enter Value E = ");
        e = s.nextFloat();
        f = d + e;
        System.out.println("Sum D + E = " + f);
        System.out.println("Scanner With String Data Type");
        System.out.print("Enter Name = ");
        name = s.nextLine();
        System.out.print("Enter Surname = ");
        surname = s.nextLine();
        fullname = name + surname;
        System.out.println("Full Name = " + fullname);
        System.out.println("Scanner With Char Data Type");
        System.out.print("Enter Charecter = ");
        ch = s.next().charAt(0);

    }

}