package arrays;

import java.util.ArrayList;

public class MiddleWay {

    public static int[] middleWay(int[] a, int[] b) {
        int[] result = new int[2];
        result[0] = a[1];
        result[1] = b[1];
        return result;
    }

    public static void main(String[] args) {
        int[] result1 = middleWay(new int[]{1, 2, 3}, new int[]{4, 5, 6});
        int[] result2 = middleWay(new int[]{7, 7, 7}, new int[]{3, 8, 0});
        int[] result3 = middleWay(new int[]{5, 2, 9}, new int[]{1, 4, 5});

        System.out.println(java.util.Arrays.toString(result1));
        System.out.println(java.util.Arrays.toString(result2));
        System.out.println(java.util.Arrays.toString(result3));
    }
}
