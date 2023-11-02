import java.util.Arrays;

public class merge {
 public static void main(String[] args) {
    int[] nums1={1,2,6};
        int[] nums2={4,6,7,2,34,8,3,4};
        int n1=nums1.length;
        int n2=nums2.length;
        Arrays.sort(nums2);
        Arrays.sort(nums1);
        int sum=n1+n2;
        int ar[]= new int[sum];
        System.arraycopy(nums1,0,ar,0,n1);
        System.arraycopy(nums2,0,ar,n1,n2);
        // Arrays.sort(ar);
        for(int i=0;i<ar.length;i++)
         System.out.print(ar[i]+" ");
 }   
}
