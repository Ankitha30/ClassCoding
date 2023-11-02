import java.util.ArrayList;
import java.util.List;

public class insertelement {
    public static void main(String[] args) {
        int a[] = { 43, 5, 3, 1, 4, 3 };
        List<Integer> list = new ArrayList<>();
        for (int value : a) {
            list.add(value);
        }
        int newElement = 452;
        int position = 2;

        list.add(position, newElement);

        Integer[] newArray = list.toArray(new Integer[0]);
        for (int i = 0; i < newArray.length; i++)
            System.out.print(newArray[i] + " ");
    }
}
