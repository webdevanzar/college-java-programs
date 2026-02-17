import java.util.*;
import java.io.*;

public class Matrix{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int row,column,i,j;
        int sum = 0;
        int a[][] = new int[10][10];
 
        System.out.println("Enter the no of rows: ");
        row = sc.nextInt();

        System.out.println("Enter the no of columns: ");
        column = sc.nextInt();

        System.out.println("Enter the matrix elements: ");

        for(i=0;i<row;i++){
            for(j=0;j<column;j++){
                 a[i][j] = sc.nextInt();
            }
        }

        System.out.println(" matrix elements: ");

        for(i=0;i<row;i++){
            System.out.println();
            for(j=0;j<column;j++){
              System.out.print( a[i][j] + "\t");
            }
        }

        System.out.println("transpose of matrix : ");

        for(i=0;i<column;i++){
            System.out.println();
            for(j=0;j<row;j++){
              System.out.print( a[i][j] +"\t");
            }
        }

        if(row != column){
            System.out.println("the matrix has no trace");
        }
        else{
        for(i=0;i<column;i++){
            for(j=0;j<row;j++){
                if(i==j){
                    sum += a[i][j];
                }
            
            }
        }
              System.out.println("this matrix trace is: "+ sum);
        }

    }
}

