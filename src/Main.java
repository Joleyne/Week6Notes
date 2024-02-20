import java.util.InputMismatchException;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        try {
            System.out.println("Please enter a number");
            int num1 = input.nextInt();
            //System.out.println(num1);

            System.out.println("Please enter a second number");
            int num2 = input.nextInt();
            //System.out.println(num2);

            add(num1, num2);
            divide(num1, num2);
        }
        catch(InputMismatchException e) {
            System.out.println("Incorrect data type");
            System.out.println("Java would say this "+ e);
        }
        catch(ArithmeticException e){
            System.out.println("Cannot / by zero");
            System.out.println("Java would say this "+e);
        }
        catch(Exception e){
            System.out.println(e);
        }


    }

    static void add(int a, int b){
        System.out.println(a+b);
    }

    static void divide(double a, double b){
        System.out.println(a/b);
    }

}