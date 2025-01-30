import java.util.Scanner;

class q15{
    public static void main (String args[])
    {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

       String result =num1>num2 ?"yes":"no";
       
       System.out.println(result);
    }
}
