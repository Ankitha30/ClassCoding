import java.util.Arrays;

public class nthsmallest {
    public static void main(String[] args) {
        int a[] = { 2, 3,1,2, 1, 3, 4, 5 };
        
        System.out.println("arr length: "+a.length);
        Arrays.sort(a);
        int n = a.length;
        int b[] = new int[n];
        int pos = 4;
        System.out.println("smallest element found at position "+pos+" is "+a[pos - 1]);
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] == a[j] && a[i] != 0) {
                    a[i] = 0;
                }
            }
            if (a[i] != 0) {
                b[i] = a[i];
            }
        }
        Arrays.sort(b);
        System.out.println("b length: "+b.length);
        System.out.println("after removing duplicate elements from the array: ");
        System.out.println(Arrays.toString(b));

    }
}
