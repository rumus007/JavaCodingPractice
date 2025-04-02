package src.recursion;
import java.util.Scanner;

public class GuessingGameBinarySearch {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int low = 1;
        int high = 200;
        System.out.format("Let us start the number guess in game choose a number between %d and %d", low, high);
        int userNumber = scanner.nextInt();
        System.out.println("Ok Game start");

        int found = binarySearch(low, high, scanner);

        if (found == -1) {
            System.out.println("Hey you did not choose a number between 1 and 100. You choose " + userNumber);
        }else {
            System.out.println("The number you guessed is " + found);
        }

        scanner.close();
    }

    public static int binarySearch(int low, int high, Scanner scanner){
        char userInput;
        if (low > high){
            return -1;
        }

        int cpuGuess = (low + high)/2;
        System.out.println("My new guess is the number: " + cpuGuess);
        System.out.println("is this correct, or do I need to go higher or lower? (c,h,l)");
        userInput = scanner.next().charAt(0);

        while(true){
            if (userInput == 'c' || userInput == 'l' || userInput == 'h'){
                break;
            }else {
                System.out.println("Sorry the choices are h,l,c for high, low and correct.");
                userInput = scanner.next().charAt(0);
            }
        }

        if (userInput == 'c'){
            return cpuGuess;
        }

        if (userInput == 'l'){
            return binarySearch(low, cpuGuess - 1, scanner);
        }else {
            return binarySearch(cpuGuess + 1, high, scanner);
        }
    }
}

