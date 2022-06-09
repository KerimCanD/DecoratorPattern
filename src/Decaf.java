public class Decaf extends Beverage{

    @Override
    public String getDescription() {
        return "Coffee withot caffein in it.";
    }

    @Override
    public Integer cost() {
        return 3;
    }
}
