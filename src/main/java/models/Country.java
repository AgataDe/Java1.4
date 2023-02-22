package models;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

public class Country {

    private String countryName;
    private char countrySign;

    public Country(String countryName, char countrySign) {
        this.countryName = countryName;
        this.countrySign = countrySign;
    }

    public Country() {
    }

    public String getCountryName() {
        return countryName;
    }

    public char getCountrySign() {
        return countrySign;
    }

    public List<Country> createNewCountry() {
        Country poland = new Country("Poland", 'P');
        Country germany = new Country("Germany", 'G');
        Country china = new Country("China", 'C');
        Country netherlands = new Country("Netherlands", 'N');
        Country korea = new Country("Korea", 'K');
        return new ArrayList<>(asList(poland, germany, china, netherlands, korea));
    }
}
