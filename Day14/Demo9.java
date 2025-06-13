package Day14;

import java.util.Arrays;

public class Demo9 {
    public static void main(String[] args) {
        Integer[] a = {1, 2, 0, 1, 2, 0, 1, 0, 0};
        Integer count0 = 0, count1 = 0, count2 = 0;
        for (int num : a) {
            if (num == 0) count0++;
            else if (num == 1) count1++;
            else if (num == 2) count2++;
        }
        Integer index = 0;
        while (count0-- > 0) a[index++] = 0;
        while (count1-- > 0) a[index++] = 1;
        while (count2-- > 0) a[index++] = 2;
        System.out.println("Sorted Array: " + Arrays.toString(a));
    }
}
