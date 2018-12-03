public class EventTest{
  public static void main(String[] args){
    Individual myIndividual = new Individual(new City[0]);
    Event myEvent = new Event('d', 200.350, myIndividual);

    // Check if the getter for type returns correct output
    if(myEvent.type() == 'd'){
      System.out.println("Pass: charTest");
    } else {
      System.out.println("FAIL: charTest");
    }

    // Check if the getter for time returns correct output
    if(myEvent.time() == 200.350){
      System.out.println("Pass: timeTest");
    } else {
      System.out.println("FAIL: timeTest");
    }

    // Check if the getter for Individual returns correct output
    if(myEvent.individual() == myIndividual){
      System.out.println("Pass: referenceTest");
    } else {
      System.out.println("FAIL: referenceTest");
    }
  }
}
