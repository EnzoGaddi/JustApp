import java.util.ArrayList;

public class JustApp {

    public static void main(String[] args)
    {
        double total = 0;
        ArrayList<Food> items = new ArrayList<>();

        System.out.println("\nWelcome to Just App");
        System.out.println("This is your order....\n");
        //Create an order
        Burger cheeseBurger = new Burger("Cheeseburger",  1.99,  "Tasty\n");
        Burger veggie = new Burger("Veggie Burger", 2.99, "Very Tasty\n");
        Pizza tuna = new Pizza("Tuna Pizza", 8.99, "Surprisingly nice\n");
        Fries curry = new Fries("Curry Fries", 2.99, "Again Very Tasty\n");
        Dessert pudding = new Dessert("Pudding", 3.99, "Very Sweet");


        //List the food items like burgers, pizzas, fries etc
        items.add(cheeseBurger);
        items.add(veggie);
        items.add(tuna);
        items.add(curry);
        items.add(pudding);

        //Display details to the user
        for(Food item : items)
        {
            System.out.println(item.getName());
            System.out.println(item.getPrice());
            System.out.println(item.getDescription());
            total += item.getPrice();
        }

        System.out.println("Total cost = " + total);

    }
}
