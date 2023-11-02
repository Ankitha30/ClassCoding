public class reverse {
    public static void main(String[] args) {
        int a[]={3,4,6,7,2,1};
        int b[]=new int[a.length];
        int n=a.length;
        for(int i=0;i<a.length;i++)
        {
          b[n-1]=a[i];
          n--;
        }
        for(int i=0;i<a.length;i++)
         System.out.print(a[i]+" ");
        System.out.println();
        for(int i=0;i<a.length;i++)
         System.out.print(b[i]+" ");
    }
}
