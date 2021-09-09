package com.example.strategy;

public class InsertionSort implements Sort {

    @Override
    public int[] sort(int[] arr) {
        int length = arr.length;
        for (int i = 1; i < length; ++i) {
            int j;
            int temp = arr[i];
            for (j = i; j > 0; --j) {
                if (arr[j - 1] > temp) {
                    arr[j] = arr[j - 1];
                } else
                    break;
            }
            arr[j] = temp;
        }
        System.out.println("插入排序");
        return arr;
    }
}
