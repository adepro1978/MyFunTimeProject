package AdePro.RestaurantMenu;

public class SachetWater extends Water {

    public String name() {
        return "Sachet Water";
    }

    @Override
    public String size() {
        return "30cl";
    }

    @Override
    public float price() {
        return 20.0f;
    }

}
