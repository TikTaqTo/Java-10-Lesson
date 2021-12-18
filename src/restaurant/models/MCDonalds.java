package restaurant.models;

import java.util.ArrayList;
import java.util.List;

public class MCDonalds implements Restaurant {

    private List<Integer> burgersPrices = new ArrayList<>();
    private List<Integer> workersSalary = new ArrayList<>();

    @Override
    public double getTotalIncome() {
        int allIncome = 0;
        for (int burgerPrice: burgersPrices) {
            allIncome+=burgerPrice;
        }
        return allIncome;
    }

    @Override
    public double getTotalOutcome() {
        int allOutcome = 0;
        for (int workerSalary: workersSalary) {
            allOutcome+=workerSalary;
        }
        return allOutcome;
    }

    public void addBurger(int burgerPrice){
        burgersPrices.add(burgerPrice);
    };
    public void addWorker(int workerSalary){
        workersSalary.add(workerSalary);
    };
}
