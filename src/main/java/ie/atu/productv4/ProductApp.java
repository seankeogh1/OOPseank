package ie.atu.productv4;

import ie.atu.productv3.Product;
import ie.atu.productv3.ProductDB;

import java.util.Scanner;

public class ProductApp {    public static void main(String[] args) {
    // display a welcome message
    System.out.println("Welcome to the Product Viewer");
    System.out.println();

    // perform 1 or more selections
    Scanner sc = new Scanner(System.in);
    String choice = "y";
    while (choice.equalsIgnoreCase("y")) {
        System.out.print("Enter product code: ");
        String productCode = sc.nextLine();  // read the product code
        // The customer could either enter a book code 'java' or software code 'studios' meaning that
        // either a book object or a software object could be returned from the ProductDb class.
        // We need to update the code so that we can handle either type of object returned.

        Product p = ProductDB.getProduct(productCode);

        // display the output
        System.out.println();
        if (p != null) {
            System.out.println("Description: " + p .toString());
            System.out.println("Price:       " + p .getPriceFormatted());
        } else {
            System.out.println("No Software matches this Software code.");
            System.out.println("Code entered: " + productCode);

        }        }
}
}
