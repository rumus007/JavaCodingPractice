package src.recursion;
import java.util.Scanner;

public class MagicMirror {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word or phrase: ");
        String phrase = scanner.nextLine();

        String reverse = mirrorFunction(phrase, phrase.length() - 1);

        System.out.format("The mirror of '%s' is '%s'", phrase, reverse);
        scanner.close();
    }

    public static String mirrorFunction(String phrase, int index) {
        if (index < 0) {
            // base case
            return "";
        }

        char ch = phrase.charAt(index);
        return ch + mirrorFunction(phrase, index - 1);
    }
}

