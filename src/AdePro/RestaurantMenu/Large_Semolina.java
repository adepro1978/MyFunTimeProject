package AdePro.RestaurantMenu;


public class Large_Semolina extends SwallowFood {
    @Override
    public float price() {
        return 250.0f;
    }

    @Override
    public String name() {

        return "Semolina";

    }

    @Override
    public String size() {
        return "Large Size";
    }
}
