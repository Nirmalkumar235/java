import java.util.Scanner;
class q3{
    public static void main (String args[])
    {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        double score = scan.nextInt();
        String dept = scan.nextLine();
        scan.nextLine();
        double ten = score/10;
        System.out.println("My nmae is "+name);
          System.out.println("My Score is "+ten+"/10");
            System.out.println("My Department is "+dept);

        } 
}