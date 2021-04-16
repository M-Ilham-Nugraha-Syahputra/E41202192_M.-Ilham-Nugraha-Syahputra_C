/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan1minggu5;

/**
 *
 * @author Ilham Nugraha
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Latihan1Minggu5 {
    public static void main(String[] args) throws IOException {
        int value;
        String data;
        Tree theTree = new Tree();
        theTree.insert(50, "Ilham");
        theTree.insert(27, "Yoga");
        theTree.insert(80, "Dhifa");
        theTree.insert(15, "Hasan");
        theTree.insert(39, "Lio");
        theTree.insert(45, "Adit");
        theTree.insert(32, "Eldi");
        theTree.insert(35, "Ade");
        theTree.insert(85, "Valen");
        theTree.insert(92, "Ayunda");
        theTree.insert(98, "Ana");
        
        while(true){
            System.out.print("Enter first letter of show, " + "insert,find,delete, or tranverse : ");
            int choice = getChar();
            switch(choice){
                case 's':
                    theTree.displayTree();
                    break;
                
                case 'i':
                    System.out.print("Enter value and data to" + " insert : ");
                    value = getInt();
                    data = getString();
                    theTree.insert(value, data);
                    break;
                
                case 'f':
                    System.out.print("enter value to find : ");
                    value = getInt();
                    Node found = theTree.find(value);
                    if(found != null){
                        System.out.print("Found : ");
                        found.displayNode();
                        System.out.print("\n");
                    } else {
                        System.out.println("Could not find " + value);
                    }
                    break;
                case 'd':
                    System.out.print("Enter value to delete : ");
                    value = getInt();
                    boolean didDelete = theTree.delete(value);
                    if(didDelete){
                        System.out.println("Delete " + value);
                    } else {
                        System.out.println("Could not delete " + value);
                    }
                    break;
                case 't':
                    System.out.print("Enter type 1, 2 or 3 : ");
                    value = getInt();
                    theTree.traverse(value);
                    break;
                default:
                    System.out.println("Invalid entry ");
            }
        }
    }
    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }
    
    public static char getChar() throws IOException {
        String a = getString();
        return a.charAt(0);
    }
    
    public static int getInt() throws IOException {
        String s = getString();
        return Integer.parseInt(s);
    }
}
