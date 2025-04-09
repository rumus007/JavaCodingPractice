package src.codewars.fundamentals;

/**
 * Given the triangle of consecutive odd numbers:

                    1
                3     5
              7     9    11
           13    15    17    19
        21    23    25    27    29
    ...
    Calculate the sum of the numbers in the nth row of this triangle (starting at index 1) e.g.: (Input --> Output)

    1 -->  1
    2 --> 3 + 5 = 8
    3 --> 
 * 
 */
public class rowSumOddNumbers {
    public static void main(String[] args){
        int n = 3;
        int startTerm = (n*(n-1)) + 1;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += startTerm;
            startTerm += 2;
        }
        System.out.println(sum);
    }
}
