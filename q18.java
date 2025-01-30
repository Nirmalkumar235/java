import java.util.Scanner;

class q18{
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         int a = scan.nextInt();
         int b = scan.nextInt();
         

        for(int i=a; i<=b; i=i+1 ){

           

            if(i%2==0){
               // System.out.println("this is even number: "+i);
            }
            else{
                System.out.println("this is odd number: "+i);
            }
            
        }
        
        
        
    }
}