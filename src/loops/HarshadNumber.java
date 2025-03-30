package src.loops;
import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer");
        int number = scanner.nextInt();
        int originNumber = number;
        int sum = 0;

        while (number > 0){
            sum += number % 10;
            number/=10;
        }

        System.out.printf("The sum of digits %d is %d %n", originNumber, sum);

        if(originNumber % sum == 0){
            System.out.println("The number is a Harshad number");
        }else {
            System.out.println("The number is not a Harshad number");
        }

        scanner.close();
    }
}
