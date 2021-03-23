/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas5_w3;

/**
 *
 * @author WINDOWS 10
 */
import java.util.Scanner;

public class switchcase {

    public static void main(String[] args) {
        String[] menu = {"Soft drinks", "Mix juice", "Nescafe", "Soda milk", "Tea"};
        String customer;
        int pilihan;
        Scanner scan = new Scanner(System.in);

        System.out.println("      CAFE CERIA");
        System.out.println("    ANEKA MINUMAN");
        System.out.println("----------------------");
        System.out.println("    SPECIAL MENU :");
        for (int i = 0; i < menu.length; i++) {
            System.out.println("   " + (i + 1) + ". " + menu[i]);
        }
        System.out.println("----------------------");

        System.out.print("Masukkan nama pembeli : ");
        customer = scan.nextLine();

        System.out.println("");
        System.out.print("Silahkan masukkan pilihan anda : ");
        pilihan = scan.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("Minuman yang anda pesan adalah " + menu[pilihan - 1]);
                System.out.println("Pesanan akan segera kami antar");
                System.out.println("Terima kasih "+ customer + " telah berkunjung di Cafe Ceria");
                break;
            case 2:
                System.out.println("Minuman yang anda pesan adalah " + menu[pilihan - 1]);
                System.out.println("Pesanan akan segera kami antar");
                System.out.println("Terima kasih "+ customer + " telah berkunjung di Cafe Ceria");
                break;
            case 3:
                System.out.println("Minuman yang anda pesan adalah " + menu[pilihan - 1]);
                System.out.println("Pesanan akan segera kami antar");
                System.out.println("Terima kasih "+ customer + " telah berkunjung di Cafe Ceria");
                break;
            case 4:
                System.out.println("Minuman yang anda pesan adalah " + menu[pilihan - 1]);
                System.out.println("Pesanan akan segera kami antar");
                System.out.println("Terima kasih "+ customer + " telah berkunjung di Cafe Ceria");
                break;
            case 5:
                System.out.println("Minuman yang anda pesan adalah " + menu[pilihan - 1]);
                System.out.println("Pesanan akan segera kami antar");
                System.out.println("Terima kasih "+ customer + " telah berkunjung di Cafe Ceria");
                break;
            default:
                System.out.println("Masukkan pilihan berupa nomor pada menu!");
                System.out.println("Harap pilih kembali !");
                break;
        }
    }
}