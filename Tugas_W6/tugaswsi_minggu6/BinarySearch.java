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
public class BinarySearch {
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for (int i=0; i<n; i++) {
            for (int j=1; j<(n-i); j++) {
                if (arr [j-1] > arr[j]) {
                    
                    //swap elemente
                    temp = arr[j-1];
                    arr [j-1] = arr [j];
                    arr [j] = temp;
                }
            }
        }
    }
    static int BinarySearch (int[]arr, int cari, int i, int j) {
        int tengah;
        while (i<=j) {
            tengah = (i+j)/2;
            if (cari == arr[tengah]) return tengah;
            else if(cari<arr[tengah])j = tengah-1;
            else i=tengah+1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] arr = {1, 100, 2, 51, 18, 85, 3, 5};
        
        bubbleSort(arr);
        
        System.out.println("Array After Sorting: ");
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        
        int cari = 3;

        System.out.println(" ");
        int hasil = BinarySearch(arr, cari, 0, arr.length-1);
        
        if (hasil>=0) System.out.println("Your target integer is in index " + hasil + " of the array");
        else System.out.println("Angka tidak ada");
    }
}

