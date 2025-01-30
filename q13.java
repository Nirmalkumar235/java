import java.util.Scanner;
class q13{
    public static void main(String args[])
    {
     Scanner scan = new Scanner(System.in);
     String color = scan.nextLine();


     if(color.equals("green"))
     {
      System.out.println("you can go");
     }
      else if(color.equals("yellow"))
     {
      System.out.println("get ready");
     }
    else
     {
      System.out.println("stop");
     }

    }
}