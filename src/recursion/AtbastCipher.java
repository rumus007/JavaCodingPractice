package src.recursion;
import java.util.Scanner;

public class AtbastCipher {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Step 1: Display menu
        System.out.println("Welcome to the Encoder-Decoder!");
        System.out.println("1. Encode a string");
        System.out.println("2. Decode a string");
        System.out.print("Choose an option (1 or 2): ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Step 2: Prompt user for input string
        System.out.print("Enter the string: ");
        String input = scanner.nextLine();

        switch (choice){
            case 1:
                // Encoding part of code
                String encoded = encoderDecoder(input, 0);
                System.out.format("The encoded word of %s is %s", input, encoded);
                break;
            case 2:
                // Decoding part of code
                String decoded = encoderDecoder(input, 0);
                System.out.format("The decoded word of %s is %s", input, decoded);
                break;
            default:
                System.out.println("Sorry that is not a valid choice");
                break;

        }
        scanner.close();
    }

    public static String encoderDecoder(String text, int index){
        char[] chArray = text.toCharArray();
        if(index == chArray.length){
            // Base case for recursive
            return "";
        }

        char ch = chArray[index];
        char encodedChar = atbash(ch);
        return encodedChar + encoderDecoder(text, index + 1);
    }

    public static char atbash(char ch) {
        if (ch >= 'a' && ch <= 'z') {
            return (char) ('z' - (ch - 'a'));
        } else if (ch >= 'A' && ch <= 'Z') {
            return (char) ('Z' - (ch - 'A'));
        } else {
            return ch;
        }
    }
}

