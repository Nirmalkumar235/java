import java.util.Scanner;

class q9{
    public static void main (String args[])
    {
      Scanner scan = new Scanner(System.in);
      int num = scan.nextInt();

      if(num%2==0){
        System.out.print("Its even number");
      }
      else{
        System.out.print("Its odd number");
      }
    }

}