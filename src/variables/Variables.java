/*
 * This is a program that does many different things
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package variables;

/**
 *
 * @author lewhi7273
 */
public class Variables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       double pi = 3.14;
       int cRadius = 15;
       System.out.println("The area of the circle would be " + pi * cRadius * cRadius);
               
       int number = 99;
       System.out.println("Wayne Gretsky is number " + number);
       
       double length = 5.7;
       double width = 4.8;
               System.out.println("length is " + length);
               System.out.println("width is " + width);
              
        System.out.println("The area of the rectangle is " + length * width);
        
        double h = 40;
        double w = 10.55;
        double i = 2;
        double t = 0.22;
        double n = (h * w - i) - t*(h * w - i);
        System.out.println("Net pay is " + n );
        
        double length2 = 8.5;
        double width2 = 6;
        double area2 = length2 * width2;
        double cost = area2 * 19.95;
        System.out.println("The cost of carpeting the floor would be " + cost);
        
        double price = 12.49;
        double money = 20;
        double tax = price * 0.13;
        double total = price + tax;
        double change = money - total;
        System.out.println("The change given would be" + change);
                
                
                
        }
    
}
