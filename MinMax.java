import java.util.*;

public class MinMax {
    public static void main(String[] args) {
        int[] ar={1,2,1000,3,0,4,5};
        int  max = Arrays.stream(ar).max().getAsInt();
        int min = Arrays.stream(ar).min().getAsInt();
        System.out.println("Maximum element in the array: "+max);
        System.out.println("Minimum element in the array: "+min);
        
    }
}
