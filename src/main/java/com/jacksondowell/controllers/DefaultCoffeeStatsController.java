package com.jacksondowell.controllers;

import com.jacksondowell.client.impl.DefaultCoffeeClient;
import com.jacksondowell.models.Coffee;
import java.util.List;
import java.util.stream.Collectors;


public class DefaultCoffeeStatsController implements DefaultCoffeeClient.Component {

  public List<String> getCoffeeNamesForCaffeineLevel(double minimum, double maximum) {
    return coffeeClient()
        .findCoffeesByCaffeineLevel(minimum, maximum)
        .stream()
        .map(Coffee::getName)
        .collect(Collectors.toList());
  }
}
