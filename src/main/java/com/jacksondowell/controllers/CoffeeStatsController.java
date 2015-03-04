package com.jacksondowell.controllers;

import com.jacksondowell.client.CoffeeClient;
import com.jacksondowell.models.Coffee;
import java.util.List;
import java.util.stream.Collectors;

/**
 * A controller responsible for creating view models to show statistics about Coffee
 */
public class CoffeeStatsController implements CoffeeClient.WrappedComponent {

  private final Config _config;

  public CoffeeStatsController(Config config) {
    _config = config;
  }

  @Override
  public Config config() {
    return _config;
  }

  /**
   *
   * @param minimum the lower bound for caffeine level
   * @param maximum the upper bound for caffeine level
   * @return a list of coffee names whose caffeine levels fall in the specified range
   */
  public List<String> getCoffeeNamesForCaffeineLevel(double minimum, double maximum) {
    return config().coffeeClient().findCoffeesByCaffeineLevel(minimum, maximum)
        .stream()
        .map(Coffee::getName)
        .collect(Collectors.toList());
  }

  public static interface Config extends CoffeeClient.Component {
    // we need can inject our own CoffeeClient this way
    public static Config create(final CoffeeClient coffeeClient) {
      // a little Java 8 syntactic sugar for an inline implementation
      return () -> coffeeClient;
    }
  }
}
