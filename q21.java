/*import java.util.Scanner;
class q21{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] num = new int[5];
            

            for (num=i; i=0; i<=5;i=i+1) {
                System.out.println(i);
            }
    }
}*/

import java.util.Scanner;

class q21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] num = new int[5];

        // Taking input from the user
        for (int i = 0; i < 5; i++) {
            num[i] = scan.nextInt();
        }

        // Printing the values
        for (int i = 0; i < 5; i++) {
            System.out.println(num[i]);
        }

        scan.close(); // Closing the scanner to prevent resource leak
    }
}
