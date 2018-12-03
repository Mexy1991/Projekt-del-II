public class CityTest{
  public static void main(String[] args){
    City Copenhagen = new City("Copenhagen", -20, 30);
    City Kolding = new City("Kolding", -100, -216605);

    // Check if distance is positive
    if(Copenhagen.distanceTo(Kolding) > 0){
      System.out.println("Pass: distancePositiveTest");
    } else {
      System.out.println("FAIL: distancePositiveTest");
    }

    // Check if the getter for name returns correct output
    if(Copenhagen.name() == "Copenhagen" && Kolding.name() == "Kolding"){
      System.out.println("Pass: nameTest");
    } else {
      System.out.println("FAIL: nameTest");
    }

    // Check if the getter for x returns correct output
    if(Copenhagen.x() == -20 && Kolding.x() == -100){
      System.out.println("Pass: xTest");
    } else {
      System.out.println("FAIL: xTest");
    }

    // Check if the getter for y returns correct output
    if(Copenhagen.y() == 30 && Kolding.y() == -216605){
      System.out.println("Pass: yTest");
    } else {
      System.out.println("FAIL: yTest");
    }

  }
}
