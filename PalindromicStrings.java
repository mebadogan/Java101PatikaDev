import java.util.Scanner;

public class PalindromicStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word to check it is palindromic.");
        String word = input.nextLine();
        String revWord = "";
        int wordLength = word.length();
        for (int i = (wordLength - 1); i >= 0;i--){
            revWord += word.charAt(i);
        }
        String result = (word.equals(revWord)) ? "YES":"NO";
        System.out.println(result);
    }
}
