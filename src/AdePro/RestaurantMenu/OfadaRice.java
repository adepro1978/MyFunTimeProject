package AdePro.RestaurantMenu;

public class OfadaRice extends Rice {

    @Override
    public float price() {
        return 300.0f;
    }

    @Override
    public String name() {
        return "Ofada Rice";
    }

    @Override
    public String size() {
        return "Large Size";
    }

}
