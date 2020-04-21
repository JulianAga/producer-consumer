package brewery;

public class BeerHouse {

  public int beers;

  public BeerHouse(Integer beers) {
    this.beers = beers;
  }

  synchronized public void produce() {
    this.beers++;
  }

  synchronized public Boolean consume() {
    if (this.beers > 0) {
      this.beers--;
      return true;
    }
    return false;
  }

   synchronized public void printBeers() {
    System.out.println(beers);
  }
}
