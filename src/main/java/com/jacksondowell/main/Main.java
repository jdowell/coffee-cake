package com.jacksondowell.main;

import com.jacksondowell.client.impl.MyCoffeeClient;
import com.jacksondowell.controllers.CoffeeStatsController;
import com.jacksondowell.controllers.DefaultCoffeeStatsController;


public class Main {

    public static void main(String[] args) {

        System.out.println("Time for some coffee!");
        System.out.println("========");
                
        CoffeeStatsController controller1 = new CoffeeStatsController(() ->  new MyCoffeeClient());

        System.out.println("All coffees with caffeine levels > 0.01 according to my custom client");
        System.out.println(controller1.getCoffeeNamesForCaffeineLevel(0.01, 1.0));
        
        System.out.println("========");
        
        DefaultCoffeeStatsController controller2 = new DefaultCoffeeStatsController();
        System.out.println("All coffees with caffeine levels > 0.01 according to the default client");
        System.out.println(controller2.getCoffeeNamesForCaffeineLevel(0.01, 1.0));

        System.out.println("========");
        System.out.println("Mmmmm cake goes well with coffee");
        
    }
}
