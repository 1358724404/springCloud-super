package com.fuhan.main;

import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author : FuHan
 * @description : ***
 * @date: 2019/12/5
 */
public class Main {
    public static void main(String[] args) {
//        int[] arr = {5,9,2,8,3,1,55,44,22,33,1,0,55,22,98,63,15,52};
//        maoPaoSort(arr);
//        System.out.println(Arrays.toString(arr));
        System.out.println(jiecheng(5));
        //ExecutorService service =new  ThreadPoolExecutor();

    }

    public static void maoPaoSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for(int j=0; j < arr.length-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }

            }
            System.out.println("第"+(i+1)+"次排序:"+ Arrays.toString(arr));
        }
    }

    public static int jiecheng(int n){
        if(n==1) {return 1;}
        return n*jiecheng(n-1);
    }
}
