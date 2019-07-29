import java.util.*;

public class Solu{

   public static void main(String... args){
      int[] a = { 2,1,3,1,6,2};
      int[] b = BS(a);
      System.out.println(Arrays.toString(b));
   }

   static int[] BS(int[] A) {
        int[] result = new int[A.length];
        for(int i = 0; i < A.length; i++){
            int count = 0;
            int max = A[i];
            for(int j = 0; j <= i; j++){
                int current = A[j];
                int internalCount = 0;
                for(int k = j; k <= i; k++){
                    if(current <= A[k] && A[k] <= max){
                        current = A[k];
                        internalCount++;
                        System.out.println("Here A[k] : " +  A[k] + "k :  " + k + " internalCount : " + internalCount + " count : " + count);
                    }
                }
                if(internalCount > count )
                    count = internalCount;
            }
            result[i] = count;
        }
        return result;
    }
}
