package com.jacksondowell.controllers;

import com.jacksondowell.client.CoffeeClient;
import com.jacksondowell.models.Coffee;
import java.util.List;
import java.util.stream.Collectors;


public class CoffeeStatsController implements CoffeeClient.WrappedComponent {

  private final Config _config;

  public CoffeeStatsController(Config config) {
    _config = config;
  }

  @Override
  public Config config() {
    return _config;
  }

  public List<String> getCoffeeNamesForCaffeineLevel(double minimum, double maximum) {
    return config().coffeeClient().findCoffeesByCaffeineLevel(minimum, maximum)
        .stream()
        .map(Coffee::getName)
        .collect(Collectors.toList());
  }

  public static interface Config extends CoffeeClient.Component {
    public static Config create(final CoffeeClient coffeeClient) {
      return () -> coffeeClient;
    }
  }
}
