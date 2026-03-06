import java.util.Scanner;

public class Triarea2{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 3 sides of a triangle: ");

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        if(a==b && b==c){
           System.out.println("Equilateral");
        }
        else if(a == b || b == c || a == c)
        {
            System.out.println("Isosceles");
        }
        else{
            System.out.println("Scalene");
        }

        double area = AreaOfATriangle(a,b,c);
        System.out.println("Area of the triangle is: " + area);

    }
    
    public static double AreaOfATriangle(double a,double b,double c){
        double s;
        s=(a+b+c)/2;
        double Area = Math.sqrt(s*(s-a)*(s-b)*(s-c));

        return Area;
    }
}
