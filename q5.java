
import java.util.Scanner;

class q5{
    public static void main (String args[])

    {
        Scanner scan = new  Scanner(System.in);

        int a =scan.nextInt();
        int b = scan.nextInt();
       scan.nextLine();
        String  c = scan.nextLine();
        String d = scan.nextLine();
        System.out.println(a==b);
        System.out.println(c.equals(d));
    }

}