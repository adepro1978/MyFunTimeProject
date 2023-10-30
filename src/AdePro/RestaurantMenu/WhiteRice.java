package AdePro.RestaurantMenu;

public class WhiteRice extends Rice {

    @Override
    public float price() {
        return 200.0f;
    }

    @Override
    public String name() {
        return "White Rice";
    }

    @Override
    public String size() {
        return "Small Size";
    }

}
