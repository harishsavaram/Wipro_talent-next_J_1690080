package arrays;

import java.util.ArrayList;
import java.util.List;

public class EvenOdd {

    public static int[] evenOdd(int[] arr) {
        List<Integer> evens = new ArrayList<>();
        List<Integer> odds = new ArrayList<>();
        
        for (int num : arr) {
            if (num % 2 == 0) {
                evens.add(num);
            } else {
                odds.add(num);
            }
        }
        
        int[] result = new int[arr.length];
        int index = 0;
        
        for (int num : evens) {
            result[index++] = num;
        }
        
        for (int num : odds) {
            result[index++] = num;
        }
        
        return result;
    }

    public static void main(String[] args) {
        int[] result1 = evenOdd(new int[]{1, 0, 1, 0, 0, 1, 1});
        int[] result2 = evenOdd(new int[]{3, 3, 2});
        int[] result3 = evenOdd(new int[]{2, 2, 2});

        System.out.println(java.util.Arrays.toString(result1));
        System.out.println(java.util.Arrays.toString(result2));
        System.out.println(java.util.Arrays.toString(result3));
    }
}
