package AdePro.RestaurantMenu;

public class MediumCoke extends Coke {

    @Override
    public String name() {
        return "500 ml";

    }

    @Override
    public String size() {

        return "Medium Size";

    }

    @Override
    public float price() {

        return 200.0f;

    }


}
