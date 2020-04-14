package brewery;

import static java.lang.Thread.sleep;

public class BeerConsumer implements Runnable {

  private BeerHouse beerHouse = null;
  private int beersToConsume = 0;

  public BeerConsumer(Integer v, BeerHouse b) {
    this.beersToConsume = v;
    this.beerHouse = b;
  }


  @Override
  public void run() {
    int i = 0;
    while (i < this.beersToConsume) {
      if (beerHouse.consume()) {
        i++;
      } else {
        try {
          sleep(50);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
      beerHouse.printBeers();
    }
  }
}

