package cloudvandana;

import java.util.*;

public class Question1 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        List<Integer> list = new ArrayList<>();

        for (int num : array) {
            list.add(num);
        }

        Collections.shuffle(list);

        Integer[] shuffled = list.toArray(new Integer[0]);

        for (int num : shuffled) {
            System.out.print(num + " ");
        }
    }
}
