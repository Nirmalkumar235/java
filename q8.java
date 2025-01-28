
import java.util.Scanner;



class q8{
    public static void main(String args[])
    {
      Scanner scan = new Scanner(System.in);

      int num = scan.nextInt();

      //if the num is divisible by 3 and 5
      // the command "and" is && amd the command for "reminder" is %
      //function is num is "divisible by both 3 and 5"
      // if num is divisible priny "yes" or if num is not divisible print "no"

       if(num%3 ==0 && num%5 ==0)
       {
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}