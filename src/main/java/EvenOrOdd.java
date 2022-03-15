import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int userNumber = scanner.nextInt();
        System.out.println("Is the number entered("+userNumber+") even? "+isEven(userNumber));
    }

    public static boolean isEven(int number){
        // solution using bitwise operator:: (number & 1) == 0
        return (number % 2) == 0;
    }
}
