import java.util.Scanner;

class q6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String vowel1 = scan.nextLine().toLowerCase();  // Read input and convert to lowercase
        String[] vowel2 = {"a", "e", "i", "o", "u"};
        
        boolean isVowel = false;  // Flag to check if the character is a vowel
        
        // Check if the input is one of the vowels
        for (String vowel : vowel2) {
            if (vowel1.equals(vowel)) {
                isVowel = true;
                break;
            }
        }
        
        if (isVowel) {
            System.out.println("This is a vowel");
        } else {
            System.out.println("This is not a vowel");
        }
    }
}

