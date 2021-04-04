/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nilai;

/**
 *
 * @author WINDOWS 10
 */
import java.util.Scanner;

public class Nilai {

    public static void main(String[] args) {
        int badat, nildat, avg, total = 0;

        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan banyak data nilai : ");
        badat = scan.nextInt();

        int[] nil = new int[badat];

        for (int i = 0; i <= badat - 1; i++) {
            System.out.print("Masukkan data nilai ke-" + (i + 1) + " : ");
            nildat = scan.nextInt();
            nil[i] = nildat;
        }
        System.out.print("\n");

        int min = nil[0];
        int max = nil[0];

        for (int i = 0; i < nil.length; i++) {
            if (nil[i] < min) {
                min = nil[i];
            } else if (nil[i] > max) {
                max = nil[i];
            }
        }
        
        for (int i = 0; i < nil.length; i++) {
            total = total + nil[i];
        }
        
        avg = total / nil.length;
        
        System.out.println("Nilai minimum adalah : " + min);
        System.out.println("Nilai maksimum adalah : " + max);
        System.out.println("Nilai rata-ratanya adalah : " + avg);

    }
}
    
