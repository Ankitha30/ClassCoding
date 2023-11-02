public class EvenSum {
    public static void main(String[] args) {
        int ar[]={1,2,3,4};
        int sum=0;
        for(int i=0;i<ar.length;i++){
        if((ar[i]^1)==(ar[i]+1))
        sum=sum+ar[i];
        }
        System.out.println("sum of even numbers in the array is: "+sum);
    }
}
