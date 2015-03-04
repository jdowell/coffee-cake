package com.jacksondowell.client;

import com.jacksondowell.models.Coffee;
import java.util.List;

/**
 * A client to get and query a Coffee database
 */
public interface CoffeeClient {

  /**
   * @param lowest the lower bound for the caffeine level
   * @param highest the upper bound for the caffeine level
   * @return A sorted list of Coffees with caffeine levels between lowest and highest (exclusive)
   */
  List<Coffee> findCoffeesByCaffeineLevel(double lowest, double highest);

  public static interface Component {

    CoffeeClient coffeeClient();
  }

  public static interface WrappedComponent extends Component {

    Component config();

    @Override
    default CoffeeClient coffeeClient() {
      return config().coffeeClient();
    }
  }
}
