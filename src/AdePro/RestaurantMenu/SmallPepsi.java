package AdePro.RestaurantMenu;

public class SmallPepsi extends Pepsi {

    @Override
    public String name() {
        return "300 ml Pepsi";
    }


    @Override
    public float price() {
        return 150.0f;
    }

    @Override
    public String size() {
        return "Small Size";
    }


}
