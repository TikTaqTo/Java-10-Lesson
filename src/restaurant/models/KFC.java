package restaurant.models;

import java.util.ArrayList;
import java.util.List;

public class KFC implements Restaurant {
    private List<Integer> basketPrices = new ArrayList<>();

    public void addBasket(int basketPrice) {
        basketPrices.add(basketPrice);
    }

    @Override
    public double getTotalIncome() {
        int allIncome = 0;
        for (int basketPrice : basketPrices) {
            allIncome += basketPrice;
        }
        return allIncome;
    }

    @Override
    public double getTotalOutcome() {
        return 0;
    }


}
