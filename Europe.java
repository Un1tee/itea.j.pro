package Lesson9_tasks;

import java.util.ArrayList;
import java.util.List;

public class Europe {
    private String name;
    private List<Country> countries;

    public Europe(String name) {
        this.name = name;
        this.countries = new ArrayList<>();
    }

    public void addCountry(Country country) {
        countries.add(country);
    }

    public List<Country> getCountries() {
        return countries;
    }

    public class Country {
        private String name;
        private int yearOfFoundation;
        private int yearOfDissolution;

        public Country(String name, int yearOfFoundation, int yearOfDissolution) {
            this.name = name;
            this.yearOfFoundation = yearOfFoundation;
            this.yearOfDissolution = yearOfDissolution;
        }

        public String getName() {
            return name;
        }

        public int getYearOfFoundation() {
            return yearOfFoundation;
        }

        public int getYearOfDissolution() {
            return yearOfDissolution;
        }
    }
}
