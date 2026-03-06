import java.util.Scanner;

public class RemoveVowels{
    public static void main(String[] args){
        Scanner sc  =  new Scanner(System.in);
        String strOrg,strNew;

        System.out.println("Enter the string : ");

        strOrg = sc.nextLine();

        strNew = strOrg.replaceAll("[aeiouAEIOU]","");

        System.out.println("new formatted string: "+ strNew);
         
    }
}