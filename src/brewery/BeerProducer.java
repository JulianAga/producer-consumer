package brewery;

public class BeerProducer implements Runnable {

  private BeerHouse beerHouse = null;
  private int beersToProduce = 0;

  public BeerProducer(Integer v, BeerHouse b) {
    this.beersToProduce = v;
    this.beerHouse = b;
  }

  @Override
  public void run() {
    int i = 0;
    while (i < this.beersToProduce) {
      beerHouse.produce();
      i++;
      beerHouse.printBeers();
    }


  }
}
