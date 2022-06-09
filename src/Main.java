public class Main {
    public static void main(String[] args) {

        Espresso espresso = new Espresso();

        Soy espressoWithSoy = new Soy(espresso);


        Caramel espressoWithCaramelAndSoy = new Caramel(espressoWithSoy);


        System.out.println(espresso);
        System.out.println(espressoWithSoy);
        System.out.println(espressoWithCaramelAndSoy);

    }
}