import java.util.Scanner;

public class SumReverse{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a,n,m=0,sum=0;

        System.out.println("Enter a number: ");
        n = sc.nextInt();

        while(n > 0)
        {
            a = n % 10;
            m = m * 10 + a;
            sum = sum + a;
            n = n / 10; 
        }

        System.out.println("sum: "+sum);
        System.out.println("reverse: "+m);

    }
}