public class Espresso extends Beverage{
    @Override
    public String getDescription() {
        return "Concentrated form of coffee served in small, strong shots";
    }

    @Override
    public Integer cost() {
        return 2;
    }
}
