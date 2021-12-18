package restaurant.services;

import restaurant.models.Restaurant;

import java.util.ArrayList;
import java.util.List;

public class City {
    private List<Restaurant> allRestaurants = new ArrayList<>();
    private String cityName;

    public City(String cityName){
        this.cityName = cityName;
    };

    public City(){};

    public void addRestaurant(Restaurant restaurant){
        allRestaurants.add(restaurant);
    };

    public double getTotalTax(){
        double allTax = 0;
        double countryDiscount = 0.15;
        for (Restaurant r: allRestaurants) {
            allTax += r.getTotalIncome() - r.getTotalOutcome();
        }
        return allTax * countryDiscount;
    };
}
