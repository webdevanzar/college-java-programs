class Complex{
    int real;
    int imag;
}

public class ComplexSum{
    public static void main(String[] args){
    Complex c1 = new Complex();
    Complex c2 = new Complex();
    Complex sum = new Complex();

    c1.real = 2;
    c1.imag = 3;

    c2.real = 4;
    c2.imag = 5;

    sum.real = c1.real + c2.real;
    sum.imag = c1.imag + c2.imag;

    System.out.println("sum = " + sum.real + "+" +sum.imag + "i");
    }
}