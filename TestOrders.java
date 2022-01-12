import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args){
        // ITEM OBJECTS
        // item 1 
        Item item1 = new Item();
        item1.name = "Coffee";
        item1.price = 1.50;
        // item 2
        Item item2 = new Item();
        item2.name = "Frapochino";
        item2.price = 6.25;
        // item 3 
        Item item3 = new Item();
        item3.name = "Iced Coffee";
        item3.price = 3.50;
        // item 4
        Item item4 = new Item();
        item4.name = "mocha";
        item4.price = 4.50;
        
        // ORDER OBJECTS
        Order order1 = new Order();
        Order order2 = new Order();
        Order order3 = new Order();
        Order order4 = new Order();

        // order1
        order1.name = "Cindhuri";

        // order 2
        order2.name = "Jimmy";

        // order3
        order3.name = "Noah";

        // order 4
        order4.name = "Sam";

        order2.items.add(item1);
        order2.total += item1.price;
        
        order3.items.add(item2);
        order3.total += item2.price;

        order4.items.add(item4);
        order4.total += item4.price;

        order1.ready = true;
        order4.ready = true;

        order4.items.add(item4);
        order4.items.add(item4);
        order4.total += item4.price *2;
        System.out.printf("Name: %s \n", order1.name);
        System.out.printf("Total: $%s \n", order1.total);
        System.out.printf("Name: %s \n", order4.name);
        System.out.printf("Total: $%s \n", order4.total);

    }
}
