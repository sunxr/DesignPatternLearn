package com.example.strategy;

public class QuickSort implements Sort{
    @Override
    public int[] sort(int[] arr) {
        System.out.println("快速排序");
        sort(arr,0,arr.length - 1);
        return arr;
    }

    public void sort(int arr[], int begin, int end) {
        int q = 0;
        if (begin < end) {
            q = partition(arr, begin, end);
            sort(arr, begin, q - 1);
            sort(arr, q + 1, end);
        }
    }

    public int partition(int[] a, int p, int r) {
        int x = a[r];
        int j = p-1;
        for(int i = p; i <= r-1;i++)
        {
            if (a[i] <=x ) {
                j++;
                swap(a,j,i);
            }
        }
        swap(a,j+1,r);
        return j+1;
    }

    public void swap(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
