
import java.util.Scanner;

class q10{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        if(num>10 && num<99){
            System.out.print("yes");
        }
        else if(num<10)
        {
            System.out.print("no");
        }

        else if(num>100 && num<120){
            System.out.print("nice");
        }

        else{
            System.out.print("meet");
        }
    }
}