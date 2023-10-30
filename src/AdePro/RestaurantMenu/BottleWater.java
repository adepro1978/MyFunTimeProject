package AdePro.RestaurantMenu;

public class BottleWater extends Water {


    @Override
    public String name() {
        return "Bottle Water";
    }

    @Override
    public String size() {
        return "50cl";
    }

    @Override
    public float price() {
        return 120.0f;
    }

}