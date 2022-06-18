package Lesson3;

public class HomeWorkApp3 {
    public static void main(String[] args) {
        int[] arr = new int[100];
        int[] arr1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int[] arr6 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        invertArray (arr1);
        fillArray (arr);
        chengeArray (arr3);
        oneCube();
        lenValue(4,2);
    }
// Задание 1.
    public static void invertArray(int[] arr1) {
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == 0) {
                arr1[i] = 1;
            } else {
                arr1[i] = 0;
            }
            System.out.print(arr1[i] + " ");
        }
        System.out.println("");
    }
// Задание 2.
    public static void fillArray(int[] arr){
       for (int i = 0; i < arr.length; i++) {
           arr[i] = i + 1;
          System.out.print(arr[i] + " ");
       }
       System.out.println("");
    }
// Задание 3.
    public static void chengeArray(int[] arr3) {
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6) {
                arr3[i] = arr3[i] * 2;
            }
            System.out.print(arr3[i] + " ");
        }
    }
// Задание 4.
    public static void oneCube(){
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
// Задание 5.
    public static void lenValue(int len, int initialValue){
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
            System.out.print("[" + i + "]" + arr[i] + " ");
        }
    }

}