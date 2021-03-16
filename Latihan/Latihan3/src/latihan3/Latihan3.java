/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan3;

/**
 *
 * @author WINDOWS 10
 */
//public class Latihan3 {

    /**
     * @param args the command line arguments
     */
    //public static void main(String[] args) {
        // TODO code application logic here
        
         class book {
       int price;
       int pages;
       
    public void set (int price, int pages) {
       this.price = price;
       this.pages = pages;
    }
    public void show (){
        System.out.println("books information");
        System.out.println("books price : " +price);
        System.out.println("number of pages : " +pages);
    }
}
    public class Latihan3 {
        public static void main(String[] args) {
            book javabook = new book();
            javabook.set(70000, 100);
            javabook.show();
        }
    }
    
    

