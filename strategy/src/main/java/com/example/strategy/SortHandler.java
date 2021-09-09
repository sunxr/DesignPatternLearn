package com.example.strategy;

public class SortHandler {

    private Sort sort;

    public void setSort(Sort sort) {
        this.sort = sort;
    }

    public int[] sort(int arr[]) {
        sort.sort(arr);
        return arr;
    }
}
