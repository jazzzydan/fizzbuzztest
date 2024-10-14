import java.util.ArrayList;
import java.util.Scanner;

public class FizzBuzzGenerator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter last number of array");
        int n = scanner.nextInt();
//        todo: kontrolliks kas number sisestatud


        ArrayList<String> fizzBuzzArray = generateFizzBuzzArray(n);
        System.out.println(fizzBuzzArray);
        scanner.close();
    }

    static ArrayList<String> generateFizzBuzzArray(int n) {
        ArrayList<String> fizzBuzzArray = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            fizzBuzzArray.add(fizzBuzzOf(i));
        }
        return fizzBuzzArray;
    }

    static String fizzBuzzOf(int i) {
        String output = "";
        if (i % 3 == 0) {
            output += "Fizz";
        }
        if (i % 5 == 0) {
            output += "Buzz";
        }
        if (output.isEmpty()) {
            output = Integer.toString(i);
        }
        return output;
    }
}