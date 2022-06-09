public class Soy extends AddonDecorator{
    public Soy(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", soy milk in it";
    }

    @Override
    public Integer cost() {
        return super.cost() + 1;
    }
}
