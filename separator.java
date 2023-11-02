public class separator {
    public static void main(String[] args) {
        int a[]={-1,0,0,2,4,-6,7};
        int negative[]=new int[a.length];
        int zero[]=new int[a.length];
        int positive[]=new int[a.length];
        int p=0,n=0,z=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>0){
               positive[p]=a[i];
               p++;
            }
            else if(a[i]<0)
             {
                negative[n]=a[i];
                n++;
             }
             else
             {
                zero[z]=a[i];
                z++;
             }
        }
        for(int i=0;i<zero.length;i++)
         System.out.print(zero[i]+" ");
        System.out.println();
        for(int i=0;i<positive.length;i++)
         System.out.print(positive[i]+" ");
        System.out.println();
        for(int i=0;i<negative.length;i++)
         System.out.print(negative[i]+" ");
        System.out.println();

    }
}
