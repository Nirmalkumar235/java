import java.util.Scanner;

class q14{
    public static void main(String args[])
    {
      Scanner scan = new Scanner(System.in);
      int salary = scan.nextInt();
      int age = scan.nextInt();
      int loan = scan.nextInt();
     
      
      if(salary>=20000 && age>=25){

       System.out.println("you are eligible");
  
           if(loan<=50000){

            System.out.println("you are eligible for loan");
        }
        else{
            System.out.println("you are not eligible for loan");
        }

      }
      else{
        System.out.println("you are not eligible");
      }
      
    }
}
