package src.codewars.fundamentals;

import java.util.stream.Collectors;

/**
 * Take 2 strings s1 and s2 including only letters from a to z. Return a new sorted string (alphabetical ascending), the longest possible, containing distinct letters - each taken only once - coming from s1 or s2.

    Examples:
    a = "xyaabbbccccdefww"
    b = "xxxxyyyyabklmopq"
    longest(a, b) -> "abcdefklmopqwxy"

    a = "abcdefghijklmnopqrstuvwxyz"
    longest(a, a) -> "abcdefghijklmnopqrstuvwxyz"
 */
public class TwotoOneString {
    public static void main(String[] args){
        String s1 = "aretheyhere";
        String s2 = "yestheyarehere";
        String finalString = (s1 + s2).chars().distinct().sorted().mapToObj(c -> String.valueOf((char) c)).collect(Collectors.joining());
        System.out.print(finalString);
    }
}
