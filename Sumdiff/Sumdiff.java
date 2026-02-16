import java.util.Scanner;
public class Sumdiff{
    public static void main(String[] args){

        Scanner in  = new Scanner(System.in);

        System.out.println("Enter first no: ");
        int numOne = in.nextInt();
        System.out.println("Enter second no: ");
        int numTwo = in.nextInt();


         System.out.printf("Sum of two numbers: %d%n ",numOne+numTwo);
         System.out.printf("Difference of two numbers: %d%n ",numOne-numTwo);
         System.out.printf("Product of two numbers: %d%n ",numOne*numTwo);
         System.out.printf("Quotiant of two numbers: %d%n ",numOne/numTwo);
         System.out.printf("Remainder of two numbers: %d%n ",numOne%numTwo);

    }
}