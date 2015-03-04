package com.jacksondowell.controllers;

import com.jacksondowell.client.impl.DefaultCoffeeClient;
import com.jacksondowell.models.Coffee;
import java.util.List;
import java.util.stream.Collectors;

/**
 * A controller responsible for creating view models to show statistics about Coffee
 * Note that this uses the DefaultCoffeeClient via the DefaultCoffeeClient.Component so there's
 * no wiring to set up at all!
 */
public class DefaultCoffeeStatsController implements DefaultCoffeeClient.Component {

  public List<String> getCoffeeNamesForCaffeineLevel(double minimum, double maximum) {
    return coffeeClient()
        .findCoffeesByCaffeineLevel(minimum, maximum)
        .stream()
        .map(Coffee::getName)
        .collect(Collectors.toList());
  }
}
