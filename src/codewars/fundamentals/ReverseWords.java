package src.codewars.fundamentals;

import java.util.ArrayList;

/**
 * Complete the function that accepts a string parameter, and reverses each word in the string. 
 * All spaces in the string should be retained.
 * 
 * Examples
 * 
 * "This is an example!" ==> "sihT si na !elpmaxe"
 * "double  spaces"      ==> "elbuod  secaps"
 */
public class ReverseWords {
    public static void main(String[] args){
        System.out.println(reverseW("The quick brown fox jumps over the lazy dog."));
    }

    public static String reverseW(String original){
        // ArrayList to add each words including the spaces
        ArrayList<Object> words = new ArrayList<>();
        // Character array of the original string
        char[] charArr = original.toCharArray();
        // StringBuilder to perform string operation reverse
        StringBuilder reverseWord = new StringBuilder();
        
        for(char ch: charArr){
            if (ch == ' '){
                if(!reverseWord.isEmpty()){
                    reverseWord.reverse().toString();
                    words.add(reverseWord);
                }
                words.add(Character.toString(ch));
                reverseWord = new StringBuilder();
            }else{
                reverseWord.append(ch);
            }
        }

        if (!reverseWord.isEmpty()){
            reverseWord.reverse().toString();
            words.add(reverseWord);
        }

        StringBuilder result = new StringBuilder();
        for(Object ele : words.toArray()){
            result.append(ele);
        }

        return result.toString();
    }
}
