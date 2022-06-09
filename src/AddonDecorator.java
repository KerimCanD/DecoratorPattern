public class AddonDecorator extends Beverage{

    private Beverage beverage;

    public AddonDecorator(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription();
    }

    @Override
    public Integer cost() {
        return beverage.cost();
    }
}
