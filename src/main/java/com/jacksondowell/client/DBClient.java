package com.jacksondowell.client;

import com.jacksondowell.models.Coffee;
import java.util.List;


/**
 * A client to perform queries on a database (a little contrived, I admit)
 */
public interface DBClient {

  /**
   * @param query the raw SQL query to run against the database
   * @return a List of Coffees (magically) that are the result of your query (empty if no results)
   */
  public List<Coffee> runQuery(String query);

  public static interface Component {

    DBClient dbClient();
  }

  public static interface WrappedComponent extends Component {

    Component config();

    @Override
    default DBClient dbClient() {
      return config().dbClient();
    }
  }
}
