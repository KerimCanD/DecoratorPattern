public abstract class Beverage {
    public abstract String getDescription();
    public abstract Integer cost();

    @Override
    public String toString() {
        return getDescription() + " - $" + cost() ;
    }
}
