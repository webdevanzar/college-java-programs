import java.util.Arrays;

public class MergeArray{
    public static void main(String[] args){
         int[] firstArray = {1,2,3,4,56};
         int[] secondArray = {7,8,9,10,226};

         int fal = firstArray.length;
         int sal = secondArray.length;

         int result[] = new int[fal + sal];

         System.arraycopy(firstArray,0,result,0,fal);
         System.arraycopy(secondArray,0,result,fal,sal);

         System.out.println(Arrays.toString(result));
   

    }
}