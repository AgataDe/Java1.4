package models;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

public class Market {

    public String name;
    private List<Country> countries;
    private Country country;

    public Market(String name, List<Country> countries) {
        this.name = name;
        this.countries = countries;
    }

    public Market() {
    }

    public List<Country> getCountries() {
        return countries;
    }

    public List<Market> createListOfNewMarkets() {
        country = new Country();
        List<Market> allMarkets = new ArrayList<>();
        allMarkets.add(new Market("business", new ArrayList<>(asList(country.createNewCountry().get(0),
                country.createNewCountry().get(1), country.createNewCountry().get(2)))));
        allMarkets.add(new Market("cargo", new ArrayList<>(asList(country.createNewCountry().get(1),
                country.createNewCountry().get(2), country.createNewCountry().get(3)))));
        allMarkets.add(new Market("transport", new ArrayList<>(asList(country.createNewCountry().get(2),
                country.createNewCountry().get(3), country.createNewCountry().get(4)))));
        allMarkets.add(new Market("taxi", new ArrayList<>(asList(country.createNewCountry().get(3),
                country.createNewCountry().get(4), country.createNewCountry().get(0)))));
        allMarkets.add(new Market("bus", new ArrayList<>(asList(country.createNewCountry().get(4),
                country.createNewCountry().get(0), country.createNewCountry().get(1)))));
        return allMarkets;
    }

    public void printFullCountryName(Country country) {
        this.country = country;
        System.out.println(country.getCountryName() + " - " + country.getCountrySign());
    }
}
