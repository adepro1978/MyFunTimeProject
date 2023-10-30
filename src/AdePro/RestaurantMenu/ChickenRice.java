package AdePro.RestaurantMenu;

public class ChickenRice extends Rice {
    @Override
    public float price() {
        return 500.0f;
    }

    @Override
    public String name() {
        return "Chicken Rice";
    }

    @Override
    public String size() {
        return "Extra-Large Size";
    }

}
