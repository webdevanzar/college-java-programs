import java.util.*;

class DecimalConversion{
    public static void main(String[] args){
        Baseconversion base = new Baseconversion();
        base.getVal();
        base.convert();
    }
}


class Baseconversion{
     int num;
    void getVal(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number to convert: ");
       num = sc.nextInt();
    }


     void convert(){
        String hex = Integer.toHexString(num);
        System.out.println("Hexadecimal: "+hex);

         String bin = Integer.toBinaryString(num);
        System.out.println("Binary: "+bin);

          String octal = Integer.toOctalString(num);
        System.out.println("Octal: "+octal);
     }

}
