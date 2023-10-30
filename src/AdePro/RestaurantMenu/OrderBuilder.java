package AdePro.RestaurantMenu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderBuilder {

    public OrderedItems prepareFood() throws IOException {

        OrderedItems itemsOrder = new OrderedItems();


        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("""
                ============================
                D-hub Food Canteen Food Menu
                ============================""");

        System.out.println(" ");

        System.out.println(" Enter food Type of choice ");
        System.out.println("============================");
        System.out.println("        1. Swallow Food      ");
        System.out.println("        2. Rice   ");
        System.out.println("        3. Exit            ");
        System.out.println("============================");

        int pizzaAndColdDrinkChoice = Integer.parseInt(bufferedReader.readLine());
        switch (pizzaAndColdDrinkChoice) {
            case 1 -> {

                System.out.println("You ordered Swallow Food");
                System.out.println("\n\n");

                System.out.println(" Enter the types of Swallow Food of choice ");
                System.out.println("------------------------------");
                System.out.println("        1.Amala        ");
                System.out.println("        2.Iyan        ");
                System.out.println("        3.Semolina        ");
                System.out.println("        4.Exit            ");
                System.out.println("------------------------------");

                int vegPizzaChoice = Integer.parseInt(bufferedReader.readLine());

                switch (vegPizzaChoice) {
                    case 1 -> {
                        System.out.println("You ordered 'Amala'");

                        System.out.println("Enter the Amala size");
                        System.out.println("------------------------------------");
                        System.out.println("    1. Small Amala ");
                        System.out.println("    2. Medium Amala ");
                        System.out.println("    3. Large Amala ");
                        System.out.println("    4. Extra-Large Amala ");
                        System.out.println("------------------------------------");
                        int cheesePizzaSize = Integer.parseInt(bufferedReader.readLine());
                        switch (cheesePizzaSize
                        ) {
                            case 1 -> itemsOrder.addItems(new Small_Amala());
                            case 2 -> itemsOrder.addItems(new Medium_Amala());
                            case 3 -> itemsOrder.addItems(new Large_Amala());
                            case 4 -> itemsOrder.addItems(new ExtraLarge_Amala());
                        }

                    }
                    case 2 -> {

                        System.out.println("You ordered 'Iyan'");

                        System.out.println("Enter the 'Iyan' size");
                        System.out.println("----------------------------------");
                        System.out.println("    1. Small 'Iyan' ");
                        System.out.println("    2. Medium 'Iyan' ");
                        System.out.println("    3. Large 'Iyan' ");
                        System.out.println("    4. Extra-Large 'Iyan' ");
                        System.out.println("----------------------------------");
                        int onionPizzaSize = Integer.parseInt(bufferedReader.readLine());
                        switch (onionPizzaSize) {
                            case 1 -> itemsOrder.addItems(new Small_Iyan());
                            case 2 -> itemsOrder.addItems(new Medium_Iyan());
                            case 3 -> itemsOrder.addItems(new Large_Iyan());
                            case 4 -> itemsOrder.addItems(new ExtraLarge_Iyan());
                        }

                    }
                    case 3 -> {

                        System.out.println("You ordered Semolina Pizza");

                        System.out.println("Enter the semolina size");
                        System.out.println("------------------------------------");
                        System.out.println("    1. Small Semolina ");
                        System.out.println("    2. Medium Semolina ");
                        System.out.println("    3. Large Semolina ");
                        System.out.println("    4. Extra-Large Semolina ");
                        System.out.println("------------------------------------");

                        int masalaPizzaSize = Integer.parseInt(bufferedReader.readLine());
                        switch (masalaPizzaSize) {
                            case 1 -> itemsOrder.addItems(new Small_Semolina());
                            case 2 -> itemsOrder.addItems(new Medium_Semolina());
                            case 3 -> itemsOrder.addItems(new Large_Semolina());
                            case 4 -> itemsOrder.addItems(new ExtraLarge_Semolina());
                        }

                    }
                }

            }
// Swallow Food choice completed.


            case 2 -> {
                System.out.println("You ordered Rice");
                System.out.println("\n\n");

                System.out.println("Enter the Non-Veg pizza size");
                System.out.println("------------------------------------");
                System.out.println("    1. White rice ");
                System.out.println("    2. Fried Rice ");
                System.out.println("    3. Ofada Rice ");
                System.out.println("    4. Chicken Rice ");
                System.out.println("------------------------------------");


                int nonVegPizzaSize = Integer.parseInt(bufferedReader.readLine());

                switch (nonVegPizzaSize) {
                    case 1 -> itemsOrder.addItems(new WhiteRice());
                    case 2 -> itemsOrder.addItems(new FriedRice());
                    case 3 -> itemsOrder.addItems(new OfadaRice());
                    case 4 -> itemsOrder.addItems(new ChickenRice());
                }

            }
            default -> {

            }
        }//end of main Switch


        System.out.println(" Enter the choice of ColdDrink ");
        System.out.println("============================");
        System.out.println("        1. Pepsi            ");
        System.out.println("        2. Coke             ");
        System.out.println("        3. Water             ");
        System.out.println("        4. Exit             ");
        System.out.println("============================");

        int coldDrink = Integer.parseInt(bufferedReader.readLine());


        switch (coldDrink) {
            case 1 -> {
                System.out.println("You ordered Pepsi ");

                System.out.println("Enter the  Pepsi Size ");
                System.out.println("------------------------");
                System.out.println("    1. Small Pepsi ");
                System.out.println("    2. Medium Pepsi ");
                System.out.println("    3. Large Pepsi ");
                System.out.println("------------------------");


                int pepsiSize = Integer.parseInt(bufferedReader.readLine());
                switch (pepsiSize) {
                    case 1 -> itemsOrder.addItems(new SmallPepsi());
                    case 2 -> itemsOrder.addItems(new MediumPepsi());
                    case 3 -> itemsOrder.addItems(new LargePepsi());
                }

            }
            case 2 -> {

                System.out.println("You ordered Coke");

                System.out.println("Enter the Coke Size");
                System.out.println("------------------------");
                System.out.println("    1. Small Coke ");
                System.out.println("    2. Medium Coke  ");
                System.out.println("    3. Large Coke  ");
                System.out.println("------------------------");

                int cokeSize = Integer.parseInt(bufferedReader.readLine());
                switch (cokeSize) {
                    case 1 -> itemsOrder.addItems(new SmallCoke());
                    case 2 -> itemsOrder.addItems(new MediumCoke());
                    case 3 -> itemsOrder.addItems(new LargeCoke());
                }
            }

                case 3 -> {

                    System.out.println("You ordered Water" + "\n" +
                                    "Enter the Water Type ");

                    System.out.println("------------------------");
                    System.out.println("    1. Bottle Water ");
                    System.out.println("    2. Sachet Water ");

                    int waterSize = Integer.parseInt(bufferedReader.readLine());
                    switch (waterSize) {
                        case 1 -> itemsOrder.addItems(new BottleWater());
                        case 2 -> itemsOrder.addItems(new SachetWater());

                    }
                }
            default -> {

            }
        }//End of the Cold-Drink switch

        return itemsOrder;


    } //End of the prepareFood() method


}//End of the OrderBuilder class.
        
        
        
       
        
        
                
        
       
