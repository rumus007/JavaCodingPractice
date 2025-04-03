package src.codewars.fundamentals;

import java.util.Arrays;
import java.util.List;

/**
 * Consider an array/list of sheep where some sheep may be missing from their place. 
 * We need a function that counts the number of sheep present in the array (true means present).
 * 
 * For example,
 * [true,  true,  true,  false,
    true,  true,  true,  true ,
    true,  false, true,  false,
    true,  false, false, true ,
    true,  true,  true,  true ,
    false, false, true,  true]
    
    The correct answer would be 17.
    Hint: Don't forget to check for bad values like null/undefined
 * 
 */
public class CountingSheeps {
    public static void main(String[] args){
        Boolean[] arraySheeps = {
                true, true, true, false, true, true,  true, true, true, false, true,
                false, true, false, false, true, true,  true,  true, true, false,
                false, true,  true, null
        };
        System.out.println(countSheeps(arraySheeps));
    }

    public static int countSheeps(Boolean[] arrayOfSheeps) {
        List<Boolean> sheeps = Arrays.asList(arrayOfSheeps);
        return (int) sheeps.stream().filter(Boolean.TRUE::equals).count();
    }
}
