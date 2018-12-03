public class IndividualTest {

  /*
  * Main to test each method of Individual.class
  */
  public static void main(String[] args){
    City cityOne = new City("Copenhagen", 6, -6);
    City cityTwo = new City("Kolding", 6, 20);
    City[] cities  = new City[2];
    cities[0] = cityOne;
    cities[1] = cityTwo;
    Individual me = new Individual(new City[0]);
    me.setPath(cities);


    // Check if the getter for path returns correct output
    if(me.path() == cities){
      System.out.println("Pass: getPathTest");
    } else {
      System.out.println("FAIL: getPathTest");
    }

    // Check if cost() returns correct output
    if(me.cost() == 26){
      System.out.println("Pass: costTest");
    } else {
      System.out.println("FAIL: costTest");
    }
  }
}
