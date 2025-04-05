package src.codewars.fundamentals;

public class Isogram {
    public static void main(String[] args){
        System.out.println(checkIsogram("Dermatoglyphics"));
        System.out.println(checkIsogram("test"));
        System.out.println(checkIsogram("abcdefgh"));

    }

    public static boolean checkIsogram(String str){
        return str.length() == str.toLowerCase().chars().distinct().count();
    }
}
