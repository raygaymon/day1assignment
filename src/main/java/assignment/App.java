package assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        List<String> cart = new ArrayList<>();
        String op = "";
        String fruit= "";
        System.out.println("Welcome to your shopping cart");

        Scanner scan = new Scanner (System.in);

        while (!"checkout".equals(op)) {
            op = scan.next();
            fruit = scan.nextLine().trim();

         if ("list".equals(op)) {
            if (cart.isEmpty()) {
                System.out.println("Your cart is empty");
            }
            else {
                for (int i = 0; i < cart.size(); i++) {
                    System.out.printf("%d. %s\n", i+1, cart.get(i));
                }

                }
            }
         else if ("add".equals(op)) {
            if (!cart.contains(fruit)) {
            cart.add(fruit);
            System.out.println(fruit +" added to cart");
        } else {
            System.out.println ("You have " + fruit + " in your cart");
             }
        } else if ("delete".equals(op)) {
            int a = Integer.valueOf(fruit);
            for (int i = 0; i < cart.size(); i++) {
                if (a==i) {
                    cart.remove(cart.get(a-1));
                    System.out.println(fruit + " has been removed");
                    break;
                } else {
                System.out.println("Incorrect item index");
            }
            }
        } 
             if ("checkout".equals(op)) {
                System.out.println ("Proceeding to payment");
                break;
            }
        }
    }
}
