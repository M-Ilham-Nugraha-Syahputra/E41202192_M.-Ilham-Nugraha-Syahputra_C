/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2_w3;

/**
 *
 * @author WINDOWS 10
 */
import java.util.Scanner;
import java.util.Random;

public class RandomArray {

    public static void main(String[] args) {
        int banyak = 0;
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        
        System.out.print("Masukkan deret array : ");
        banyak = scan.nextInt();

        for (int i = 0; i <= banyak - 1; i++) {
            int[] rndm = new int[banyak];
            rndm[i] = random.nextInt(100);
            System.out.print(rndm[i] + " ");
        }
        System.out.println("");
    }
}