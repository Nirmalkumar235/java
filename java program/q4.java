
import java.util.Scanner;

class q4{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        
        if(num1==num2)
        {
            System.err.println("number 1 and numner 2 is equal");
        }
        else{
             System.err.println("number 1 and number 2 is not equal");
        }
    }
}