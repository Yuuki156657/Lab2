public class Province {
    private static final String DEFAULT_PROVINCE = "British Columbia";
    private static final String DEFAULT_CAPITAL = "Victoria";
    private static final int DEFAULT_POPULATION_MILLIONS = 4;
    // attribute
    private String name;
    private String capital;
    private int populationInMillions;

    // constructor
    public Province(String name, String capital, int populationInMillions){
        if (isValidProvince(name) && isValidCapitalCity(capital) && isValidPopulation(populationInMillions)) {
            this.name = name;
            this.capital = capital;
            this.populationInMillions = populationInMillions;
        } else {
            this.name = DEFAULT_PROVINCE;
            this.capital = DEFAULT_CAPITAL;
            this.populationInMillions = DEFAULT_POPULATION_MILLIONS;
        }

    }

    // accessor
    public String getName() {
        return name;
    }

    public String getCapital() {
        return capital;
    }

    public int getPopulationInMillions() {
        return populationInMillions;
    }


    // mutator
    public void setName(String name) {
        this.name = name;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public void setPopulationInMillions(int populationInMillions) {
        this.populationInMillions = populationInMillions;
    }

    // behaviors - methods
    private boolean isValidProvince (String province) {
        String[] provinces = {"Ontario", "Quebec", "Nova Scotia", "New Brunswick", "Manitoba", "British Columbia", "Prince Edward Island", "Saskatchewan", "Alberta", "Newfoundland and Labrador"};
        int i = 0;
        while (i < provinces.length) {
            if (province.equals(provinces[i])) {
                return true;
            }
            i++;
        }
        return false;
    }

    private boolean isValidCapitalCity(String capital) {
        String[] capitals = {"Toronto", "Quebec City", "Halifax", "Fredericton", "Winnipeg", "Victoria", "Charlottetown", "Regina", "Edmonton", "St. John's", };
        for (String cap : capitals) {
            if (capital.equals(cap)) {
                return true;
            }
        }
        return false;
    }

    private boolean isValidPopulation(int populationInMillions) {
        if (populationInMillions >= 0 && populationInMillions <= 38) {
            return true;
        }
        return false;
    }

    public String getDetails() {
        return "The capital of " + this.name + " (pop. " + this.populationInMillions + " million) is " + this.capital;
    }
}
