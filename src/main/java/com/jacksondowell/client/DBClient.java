package com.jacksondowell.client;

import com.jacksondowell.models.Coffee;
import java.util.List;


public interface DBClient {

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
