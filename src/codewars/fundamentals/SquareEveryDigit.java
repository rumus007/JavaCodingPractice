package src.codewars.fundamentals;

import java.util.stream.Collectors;
/**
 * Welcome. In this kata, you are asked to square every digit of a number and concatenate them.
 * 
 * For example, if we run 9119 through the function, 811181 will come out, because 92 is 81 and 12 is 1. (81-1-1-81)
 * 
 * Example #2: An input of 765 will/should return 493625 because 72 is 49, 62 is 36, and 52 is 25. (49-36-25)
 * 
 * Note: The function accepts an integer and returns an integer.
 * 
 */
public class SquareEveryDigit {
    public static void main(String[] args){
        int n = 9119;
        int arr = Integer.parseInt( // Parses final string value to integer
            String.valueOf(n) // Converts initial int value to string
                .chars()    // Provides IntStream of Characters
                .map(c -> c - '0') // Maps each IntStream to Int i.e returns each digits converting from char to int
                .map(c -> c*c)     // Maps each Intstream and squares it
                .mapToObj(String::valueOf) // Converts the squared digit back to String
                .collect(Collectors.joining(""))); // joins digit to create a final string value of integer

        System.out.println(arr);
    }
}
