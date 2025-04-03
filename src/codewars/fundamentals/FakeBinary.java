package src.codewars.fundamentals;

/**
 * Given a string of digits, you should replace any digit below 5 with '0' and any digit 5 and above with '1'. 
 * Return the resulting string.
 * 
 * Note: input will never be an empty string
 */
public class FakeBinary {
    public static void main(String[] args){
        System.out.println(fakeBin("45385593107843568"));
    }

    public static String fakeBin(String numberString){
        // One liner code -  same output
        // return numberString.replaceAll("[0-4]","0").replaceAll("[5-9]","1");

        String[] arr = numberString.split("");
        StringBuilder fakeBinary = new StringBuilder();
        for(String ele: arr){
            int i = Integer.parseInt(ele);
            if (i < 5){
                fakeBinary.append("0");
            }else {
                fakeBinary.append("1");
            }
        }
        return fakeBinary.toString();
    }
}
