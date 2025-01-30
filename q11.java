import java.util.Scanner;
class q11{
    public static void main (String args[])
    {
        Scanner scan = new Scanner (System.in);
        int score = scan.nextInt();

        if(score<50)
        {
            System.out.println("you need to improve");
        }

           else if(score>=50 && score<70)
        {
            System.out.println("Good Job");
        }

           else if(score>=70)
        {
            System.out.println("Excellent performance");
        }
    }
}