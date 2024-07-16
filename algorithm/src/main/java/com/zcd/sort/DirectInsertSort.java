package com.zcd.sort;

/**
 * algorithm
 * @Author 张琛栋 QQ：847890638
 * @ClassName DirectInsertSort
 * @Date 2021/3/19 3:53 PM
 * @Description // 直接插入排序
 */
public class DirectInsertSort {

    public static void main(String[] args) {

        int[] a = {49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 1};
        System.out.println("排序前：");
        for(int befor: a){
            System.out.print(befor+ " ");
        }
        System.out.println("**********");

        for(int i = 1; i< a.length; i++){
            int temp = a[i];
            int j;
            for(j = i - 1; j >= 0; j--){
                if(a[j] > temp){
                    a[j + 1] = a[j];
                }else{
                    break;
                }
            }
            a[j + 1] = temp;
        }

        System.out.println("排序后：");
        for(int after: a){
            System.out.print(after+" ");
        }

    }
}
