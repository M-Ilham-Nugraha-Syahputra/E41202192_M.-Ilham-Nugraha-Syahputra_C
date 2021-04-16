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
public class BubbleShortAscending{
    
    static void bubbleShort(int[] arr)
    {
        int n = arr.length;
        int temp = 0;
        for(int i=0; i < n; i++)
        {
            for(int j=1; j < (n-i); j++)
            {
                if(arr[j-1] > arr[j])
                {
                    //SWAP elements
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }

            }
        }
    }            
    public static void main(String[] args)
{
        int arr[] ={3,8,7,1,10};
    
        System.out.println("Array Before Bubble Short");
        for(int i=0; i < arr.length; i++)
    {
            System.out.print(arr[i] + " ");
    }
            System.out.println();
        
            bubbleShort(arr);//sorting array elements using bubble short
        
            System.out.println("Array After Bubble Short");
        for(int i=0; i < arr.length; i++)
    {
            System.out.print(arr[i] + " ");
        }
    }  
}        