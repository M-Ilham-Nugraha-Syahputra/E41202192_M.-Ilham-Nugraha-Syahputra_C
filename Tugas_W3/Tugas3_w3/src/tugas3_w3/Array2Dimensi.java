/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas3_w3;

/**
 *
 * @author WINDOWS 10
 */
public class Array2Dimensi {

    public static void main(String[] args) {
        int[][] angkarray = {{5, 6, 1, 7}, {8, 1, 2, 9}, {5, 4, 7, 1}, {8, 3, 7, 5}};
        for (int kanan = 0; kanan < 4; kanan++) {
            for (int bawah = 0; bawah < 4; bawah++) {
                System.out.print(angkarray[kanan][bawah] + "  ");
            }
            System.out.println("");
        }
    }
}