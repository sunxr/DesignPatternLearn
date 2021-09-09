package com.example.strategy;

public class Client {

    public static void main(String args[]) {
        int arr[] = {1,4,6,2,5,3,7,10,9};
        int result[];
        SortHandler sh = new SortHandler();

        Sort sort;
        sort = new InsertionSort();

        sh.setSort(sort); //设置具体策略
        result = sh.sort(arr);

        for(int i = 0; i < result.length; i++)
        {
            System.out.print(result[i] + ",");
        }
    }

}
