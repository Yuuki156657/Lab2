public class Driver {
    public static void main(String[] args) {

        Province bc = new Province("Ontario", "Toronto", 14);
        Province ny = new Province("New York", "Albany", 0);
        System.out.println(bc.getDetails());
        System.out.println(ny.getDetails());

        Country ca = new Country();
        ca.displayAllProvinces(); // print details for all provinces

        ca.howManyHaveThisPopulation(0, 13);
    }
}

