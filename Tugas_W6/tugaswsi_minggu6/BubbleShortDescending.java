/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaswsi_minggu6;

/**
 *
 * @author Ilham Nugraha
 */
public class BubbleShortDescending {
    
    static void bubbleSort(int[] arr){
        int n = arr.length;
        int temp = 0;
        for (int i=0; i < n; i++){
            for (int j=1; j < (n-i); j++){
                if (arr[j-1] > arr[j]){
                    //swap elements
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }


    public static void main(String[] args){
        int arr[] = {3,8,7,1,10};
        
        System.out.println("Array Before Bubble Sort");
        for (int i=0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();       
        bubbleSort(arr);//Sorting array elements using bubble sort
       
          int a;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    a = arr[i];
                    arr[i] = arr[j];
                    arr[j] = a;
                }
            }
        }
        
        System.out.println("\n");
        System.out.println("Array After Bubble Sort in Descending");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
