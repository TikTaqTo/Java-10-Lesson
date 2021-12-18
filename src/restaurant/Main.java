package restaurant;

import restaurant.models.KFC;
import restaurant.models.MCDonalds;
import restaurant.services.City;

public class Main {
    public static void main(String[] args) {
        MCDonalds mc0 = new MCDonalds();
        MCDonalds mc1 = new MCDonalds();
        KFC kfc0 = new KFC();

        mc0.addBurger(300);
        mc0.addBurger(500);

        mc0.addWorker(400);
        mc0.addWorker(300);

        mc1.addWorker(200);
        mc1.addWorker(200);

        mc1.addBurger(300);
        mc1.addBurger(600);

        kfc0.addBasket(400);

        City Almaty = new City();

        Almaty.addRestaurant(mc0);
        Almaty.addRestaurant(mc1);
        Almaty.addRestaurant(kfc0);

        System.out.println(Almaty.getTotalTax());
    }
}
