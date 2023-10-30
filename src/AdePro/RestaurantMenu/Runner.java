package AdePro.RestaurantMenu;

import java.io.IOException;

public class Runner {

    public static void main(String[] args) throws IOException {

        OrderBuilder builder = new OrderBuilder();

        OrderedItems orderedItems = builder.prepareFood();

        orderedItems.showItems();

        System.out.println("\n");
        System.out.println("Total Cost : " + orderedItems.getCost());

    }
}
