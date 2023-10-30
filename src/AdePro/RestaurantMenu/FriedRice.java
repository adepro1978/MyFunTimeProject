package AdePro.RestaurantMenu;

public class FriedRice extends Rice {

    @Override
    public float price() {
        return 259.0f;
    }

    @Override
    public String name() {
        return "Fried Rice";
    }

    @Override
    public String size() {
        return "Medium Size";
    }

}
