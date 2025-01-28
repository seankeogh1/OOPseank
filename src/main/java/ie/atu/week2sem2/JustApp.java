package ie.atu.week2sem2;
import java.util.ArrayList;

public class JustApp {

    public static void main(String[] args){
        ArrayList<Food> items = new ArrayList<>();

        System.out.println("Welcome to Just App");
        System.out.println("you ordered..");


        Burger cheeseBurger = new Burger("CheeseBurger", 1.99, "Tasty");
        Pizza tuna = new Pizza(" Tuna Pizza", 8.99, "Surprisingly nice");
        Pizza classic = new Pizza("Plain ",6.99, "Boring");
        Fries curry = new Fries("curry",1.99,"nice also");
        //add all the orders to a collection
        items.add(cheeseBurger);
        items.add(tuna);
        items.add(curry);

        //display all orders
        for(Food item : items)
        {
            System.out.println(item.getName());
            System.out.println(item.getPrice());
            System.out.println(item.getDescription());
        }
        //Find the total cost of the whole order
    }
}
