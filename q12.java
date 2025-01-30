import java.util.Scanner;
class q12{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int e = scan.nextInt();
        int t = scan.nextInt();
        int s = scan.nextInt();
        int so = scan.nextInt();
        int m = scan.nextInt();

        int mark = e+t+s+so+m;

      if(mark/5<=35){
       System.out.println("you have to attend spcial class");
    }

    else{
        System.out.println("you have regular class");  
    }
}
}