package com.jacksondowell.controllers;

import com.jacksondowell.client.CoffeeClient;
import com.jacksondowell.models.Coffee;
import java.util.Arrays;
import java.util.List;
import org.testng.annotations.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.testng.Assert.assertNotNull;


public class TestCoffeeStatsController {

  @Test
  public void test() {
    CoffeeClient mockCoffeeClient = mock(CoffeeClient.class);
    when(mockCoffeeClient.findCoffeesByCaffeineLevel(0.0, 1.0)).thenReturn(Arrays.asList(new Coffee("foobar", 0.2)));
    CoffeeStatsController subject = createSubject(mockCoffeeClient);
    List<String> result = subject.getCoffeeNamesForCaffeineLevel(0.0, 1.0);
    verify(mockCoffeeClient).findCoffeesByCaffeineLevel(0.0, 1.0);
    assertNotNull(result);
  }
  
  private CoffeeStatsController createSubject(final CoffeeClient coffeeClient) {
    // pass in the CoffeeClient almost like a constructor arg
    return new CoffeeStatsController(CoffeeStatsController.Config.create(coffeeClient));
  }
  
  
}
