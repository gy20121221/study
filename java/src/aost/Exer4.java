package aost;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Exer4 {
    public static void main(String[] args) {


        int[] ints = {1, 2, 32, 3, 3, 5, 878, 488, 4};
        for (int anInt : ints) {
            System.out.print(anInt + " ");
        }
        System.out.println();
//        ints = MergeSort(ints);
//        MySort(ints);
        CountingSort(ints);


//        Arrays.sort(ints);
        for (int anInt : ints) {
            System.out.print(anInt + " ");
        }


    }

    /**
     * 归并排序
     */
    public static int[] MergeSort(int[] array) {
        if (array.length < 2) return array;
        int mid = array.length / 2;
        int[] left = Arrays.copyOfRange(array, 0, mid);
        int[] right = Arrays.copyOfRange(array, mid, array.length);
        return merge(MergeSort(left), MergeSort(right));
    }

    /**
     * 归并排序——将两段排序好的数组结合成一个排序数组
     */
    public static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        for (int index = 0, i = 0, j = 0; index < result.length; index++) {
            if (i >= left.length)
                result[index] = right[j++];
            else if (j >= right.length)
                result[index] = left[i++];
            else if (left[i] > right[j])
                result[index] = right[j++];
            else
                result[index] = left[i++];
        }
        return result;
    }


    public static int[] MySort(int[] array) {
        // write code here
        int s;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    s = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = s;
                }
            }
        }
        return array;
    }


    /**
     * 计数排序
     */
    public static int[] CountingSort(int[] array) {
        if (array.length == 0) return array;
        int bias, min = array[0], max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
            if (array[i] < min)
                min = array[i];
        }
        bias = -min;
        int[] bucket = new int[max - min + 1];
        Arrays.fill(bucket, 0);
        for (int j : array) {
            bucket[j + bias]++;
        }
        int index = 0, i = 0;
        while (index < array.length) {
            if (bucket[i] != 0) {
                array[index] = i - bias;
                bucket[i]--;
                index++;
            } else
                i++;
        }
        return array;
    }

}
