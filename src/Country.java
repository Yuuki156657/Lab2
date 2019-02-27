public class Country {
    private String name;
    private Province[] provinces;

    public Country() {
        this.name = "Canada";
        this.provinces = new Province[10];
        this.provinces[0] = new Province("Ontario", "Toronto", 13);
        this.provinces[1] = new Province("Quebec", "Quebec City", 8);
        this.provinces[2] = new Province("Nova Scotia", "Halifax", 0);
        this.provinces[3] = new Province("New Brunswick", "Fredericton", 0);
        this.provinces[4] = new Province("Manitoba", "Winnipeg", 1);
        this.provinces[5] = new Province("British Columbia", "Victoria", 4);
        this.provinces[6] = new Province("Prince Edward Island", "Charlottetown", 0);
        this.provinces[7] = new Province("Saskatchewan", "Regina", 1);
        this.provinces[8] = new Province("Alberta", "Edmonton", 4);
        this.provinces[9] = new Province("Newfoundland and Labrador", "St. John's", 0);

    }

    public void displayAllProvinces() {
        // TODO
//        String[] provinces = {"Toronto", "Quebec City", "Halifax", "Fredericton", "Winnipeg", "Victoria", "Charlottetown", "Regina", "Edmonton", "St. John's"};
//        String[] capitals = {"Toronto", "Quebec City", "Halifax", "Fredericton", "Winnipeg", "Victoria", "Charlottetown", "Regina", "Edmonton", "St. John's"};
//        int[] populationInMilions = {13, 8, 0, 0, 1, 4, 0, 1, 4, 0};

        for (Province elem : this.provinces) {
            System.out.println(elem.getDetails());
        }
    }

//        for (String province : provinces) {
//            for (String capital : capitals) {
//                for (int populationInMilion : populationInMilions) {
//        System.out.println("The capital of " + province + " (pop. " + populationInMilions + " million) is " + capitals);
//                }
//            }
//        }
//    }
//}

//        String[] countries = {"japan", "canada"};
//
//        for(String country: countries){
//            System.out.println(country);
//        }

    public int howManyHaveThisPopulation(int min, int max) {
        int many = 0;
        for (Province elem : this.provinces) {
            if (elem.getPopulationInMillions() >= min && elem.getPopulationInMillions() <= max) {
                many++;
            }
        }
        System.out.println(many);
        return many;
    }
}