public class Caramel extends AddonDecorator{

    public Caramel(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", caramel in it";
    }

    @Override
    public Integer cost() {
        return super.cost() + 1;
    }
}
