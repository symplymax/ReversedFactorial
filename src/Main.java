import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try{
            System.out.println("Input factorial (n!)");
            Scanner scanner = new Scanner(System.in);
            BigInteger factorial = new BigInteger(scanner.next());

            Factorial reverseFactorial = new Factorial(factorial);
            System.out.println("Reverse Factorial: " + reverseFactorial.getReverseFactorial());
        }
        catch(Error e){
            System.out.println("Something went wrong :(");
            System.out.println(e.getMessage());
        }
        catch(Exception e){
            System.out.println("Sorry, but we can not process your request.");
        }
    }

}
