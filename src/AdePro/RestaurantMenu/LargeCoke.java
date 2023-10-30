package AdePro.RestaurantMenu;

public class LargeCoke extends Coke {
    @Override
    public String name() {
        return "750 ml";

    }

    @Override
    public String size() {

        return "Large Size";

    }

    @Override
    public float price() {

        return 250.0f;

    }

}
