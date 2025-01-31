import java.util.Scanner;

class q1{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        int i = scan.nextInt();
        int j =scan.nextInt();

        int count =0;

        for(i=1;i<=j;i=i+1)
        { 
             if( i%11!=0 && i%5==0 )
             {
                      count =count+1;
          //System.out.println(i);
        }
         
        }

    

    
         System.out.println(count);
          
        }  
    
}