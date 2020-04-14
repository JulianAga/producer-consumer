package brewery;

public class Main {

  public static void main(String[] args) {

    BeerHouse beerHouse = new BeerHouse(0);
    BeerProducer producer = new BeerProducer(50, beerHouse);
    BeerConsumer consumer = new BeerConsumer(50, beerHouse);

    Thread tProducer = new Thread(producer);
    Thread tConsumer = new Thread(consumer);

    tProducer.start();
    tConsumer.start();



  }
}
