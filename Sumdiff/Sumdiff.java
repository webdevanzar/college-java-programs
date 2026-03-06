public class Sumdiff{
    public static void main(String[] args){

        int numOne = Integer.parseInt(args[0]);
        int numTwo = Integer.parseInt(args[1]);


         System.out.printf("Sum of two numbers: %d%n ",numOne+numTwo);
         System.out.printf("Difference of two numbers: %d%n ",numOne-numTwo);
         System.out.printf("Product of two numbers: %d%n ",numOne*numTwo);
         System.out.printf("Quotiant of two numbers: %d%n ",numOne/numTwo);
         System.out.printf("Remainder of two numbers: %d%n ",numOne%numTwo);

    }
}