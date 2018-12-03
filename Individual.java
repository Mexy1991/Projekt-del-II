import java.util.*;

public class Individual{
  private City[] path;
  private double cost = 0;

  /*
  * Creates random permutation of given City[] and constructs new Individual from it
  */
  public Individual(City[] originalPath){
    path = originalPath;
    for(int i = path.length-1; i>0; i--){
      int noise = RandomUtils.getRandomValue(i);
      City placeholder = new City(path[noise].name(), path[noise].x(), path[noise].y());
      path[noise] = path[i];
      path[i] = placeholder;
    }
  }

  // Getter for path
  public City[] path(){
    return(path);
  }

  // Setter for path
  public void setPath(City[] newPath){
    path = newPath;
  }

  // Returns cost of distance between all cities in path.
  public double cost(){
    City oldCity = path[0];
    for(City city : path){
      cost += city.distanceTo(oldCity);
      oldCity = city;
    }
    return(cost);
  }

  //Mutates path by choosing two random cities and switching them.
  public void mutate(){
      int indexOne = RandomUtils.getRandomValue(path.length);
      int indexTwo = RandomUtils.getRandomValue(path.length);
      System.out.println("Random Number #1: " + String.valueOf(indexOne) + " Random Number #2: " + String.valueOf(indexTwo));
      City placeholder = new City(path[indexOne].name(), path[indexOne].x(), path[indexOne].y());
      path[indexOne] = path[indexTwo];
      path[indexTwo] = placeholder;
  }

  // Produces a new descendant Individual varying from this.Individual by one mutation.
  public Individual reproduce(){
    City[] emptyPath = new City[0];
    Individual newBoy = new Individual(emptyPath);
    newBoy.setPath(this.path());
    newBoy.mutate();
    return(newBoy);
  }
}
