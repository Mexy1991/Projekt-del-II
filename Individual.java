import java.util.*;

public class Individual{
  private City[] path;
  private double cost = 0;

  /*
  * Main to test each function
  */
  public static void main(String[] args){
    City cityOne = new City("Copenhagen", 2, 3);
    City cityTwo = new City("Kolding", 6, 19);
    City cityThree = new City("Budapest", 500, 206);
    City[] cities  = new City[3];

    cities[0] = cityOne;
    cities[1] = cityTwo;
    cities[2] = cityThree;

    // This is how the City[] looks before we use put it into an Individual
    for(City myCity : cities){
      System.out.println(myCity.name());
    }

    System.out.println("\n----------------\n");

    // This should show a random permutation of Individual
    Individual me = new Individual(cities);
    for(City myCity : me.path()){
      System.out.println(myCity.name());
    }

    System.out.println("\n----------------\n");

    /*
    *This should show a mutation of the previous Individual.
    *(cities can switch with themselves, so may not show any change)
    */
    me.mutate();
    for(City myCity : me.path()){
      System.out.println(myCity.name());
    }
    System.out.println("Cost of Path: " + me.cost());
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

  public City[] path(){
    return(path);
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

  // Produces a new Individual varying by one mutation.
  public Individual reproduce(){
    mutate();
    Individual newBoy = new Individual(path);
    return(newBoy);
  }
}
