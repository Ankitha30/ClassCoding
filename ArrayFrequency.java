import java.util.Arrays;

public class ArrayFrequency {
 public static void main(String[] args) {
    int a[]= {1,2,4,2,1};
    Arrays.sort(a);
    for(int i=0;i<a.length;i++)
    {
        int f=1;
        int j;
        for( j=i+1;j<a.length;j++){
            if(a[j]==a[i])
             f++;
            else
             break;
            
        }
        System.out.println("Element "+a[i]+" occurs "+f+" times in the given array.");
        i=j-1;

    }
 }   
}
