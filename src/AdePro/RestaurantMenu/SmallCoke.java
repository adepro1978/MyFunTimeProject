package AdePro.RestaurantMenu;


public class SmallCoke extends Coke {

    @Override
    public String name() {
        return "300 ml";

    }

    @Override
    public String size() {

        return "Small Size";

    }

    @Override
    public float price() {

        return 150.0f;

    }

}
