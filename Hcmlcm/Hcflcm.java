import java.util.Scanner;
public class Hcflcm{
public static void main(String[] args){
    Scanner sc =  new Scanner(System.in);
    int x,y,a,b,t,hcf,lcm;
    System.out.println("Enter two numbers: ");

    x  =  sc.nextInt();
    y  =  sc.nextInt();
    a = x;
    b = y;

    while(b != 0){
        t = b;
        b = a%b;
        a = t;
    }

    hcf = a;
    lcm = (x*y)/hcf;

    System.out.println("HCF: " + hcf);
    System.out.println("LCM: " + lcm);

}
}

