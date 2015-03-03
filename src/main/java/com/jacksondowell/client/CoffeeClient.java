package com.jacksondowell.client;

import com.jacksondowell.models.Coffee;
import java.util.List;


public interface CoffeeClient {

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
