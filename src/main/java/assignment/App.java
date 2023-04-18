package assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        List<String> cart = new ArrayList<>();
        String op = "";
        String fruits = "";
        System.out.println("Welcome to your shopping cart");

        Scanner scan = new Scanner(System.in);

        while (!"checkout".equals(op)) {
            op = scan.next();
            fruits = scan.nextLine().trim();

            if ("list".equals(op)) {
                if (cart.isEmpty()) {
                    System.out.println("Your cart is empty");
                } else {
                    for (int i = 0; i < cart.size(); i++) {
                        System.out.printf("%d. %s\n", i + 1, cart.get(i));
                    }
                }
            }

            else if ("add".equals(op)) {
                if (!cart.contains(fruits)) {
                    String[] manyFruits = fruits.split(", |,|//s+");
                    for (int i = 0; i < manyFruits.length; i++) {
                        cart.add(manyFruits[i]);
                    }
                    System.out.println(fruits + " added to cart");
                } else {
                    System.out.println("You already have " + fruits + " in your cart");
                }
            }

            else if ("delete".equals(op)) {
                int a = Integer.valueOf(fruits);
                if (a <= cart.size()) {
                    cart.remove(cart.get(a - 1));
                    System.out.println(fruits + " has been removed");
                } else {
                    System.out.println("Incorrect item index");
                    }
            }
               if ("checkout".equals(op)) {
                System.out.println("Proceeding to payment");
                break; 
                } 
            } 
    }
}
