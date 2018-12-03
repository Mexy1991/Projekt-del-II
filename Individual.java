import java.util.*;

public class Individual{
  private City[] path;
  private double cost = 0;

  /*
  * Main to test each method of Individual.class
  */
  public static void main(String[] args){
    City cityOne = new City("Copenhagen", 2, 3);
    City cityTwo = new City("Kolding", 6, 19);
    City cityThree = new City("Budapest", 500, 206);
    City[] cities  = new City[3];
    cities[0] = cityOne;
    cities[1] = cityTwo;
    cities[2] = cityThree;

    // This is how the City[] looks before we use it in an Individual
    for(City myCity : cities){
      System.out.println(myCity.name());
    }
    System.out.println("----------------\n");

    // This should show a random permutation of the above City[]
    Individual me = new Individual(cities);
    for(City myCity : me.path()){
      System.out.println(myCity.name());
    }
    System.out.println("----------------\n");

    /*
    *This should show a mutation of the previous Individual.
    *(cities can switch with themselves, so may not show any change)
    */
    me.mutate();
    for(City myCity : me.path()){
      System.out.println(myCity.name());
    }
    System.out.println("Cost of Path: " + me.cost());
    System.out.println("----------------\n");

    /*
    * This should show a new Individual differing from the ancestor by one mutation
    */
    Individual myDescendant = me.reproduce();
    for(City myCity : myDescendant.path()){
      System.out.println(myCity.name());
    }
    System.out.println("Cost of Path: " + myDescendant.cost());
  }

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
  private void setPath(City[] newPath){
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
