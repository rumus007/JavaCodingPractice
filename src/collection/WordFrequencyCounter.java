package src.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordFrequencyCounter {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> wordMapper = new HashMap<>();
        String userInput;
        System.out.println("Enter a paragraph to start the word counter");
        userInput = scanner.nextLine();
        // Text normalization
        String normalized = normalization(userInput);
        // String Array for normalized words
        String[] stringArr = normalized.split(" ");

        for(String key : stringArr){
            wordMapper.put(key, wordMapper.getOrDefault(key, 0) + 1);
        }

        String mostFrequentWord = null;
        int maxCounter = 0;

        for(Map.Entry<String, Integer> entry : wordMapper.entrySet()){
            if (entry.getValue() >= maxCounter){
                mostFrequentWord = entry.getKey();
                maxCounter = entry.getValue();
            }
        }

        if (mostFrequentWord != null && maxCounter != 0){
            System.out.format("The most frequent word is (%s) with the count of: %d", mostFrequentWord, maxCounter);
        }else {
            System.out.println("There is no word present in the paragraph");
        }

        scanner.close();
    }

    /**
     * Normalization of text. Convert all to lowercase. Remove whitespaces and all punctuation marks.
     * @param text
     * @return String
     */
    public static String normalization(String text){
        return text.toLowerCase().trim().replaceAll("[^a-z0-9 ]", "");
    }
}

