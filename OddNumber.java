public class OddNumber {
    public static void main(String[] args) {
        int[] ar={2234,23456,76,9116,1,1,5};
        int flag=0;
        for(int i=0;i<ar.length;i++){
            if((ar[i]^1)==(ar[i]-1)){
            flag=1;
            System.out.println(ar[i]);
            }
        }
        if(flag==0)
        System.out.println("No odd numbers in the given array");
    }
}
