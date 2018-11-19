import java.util.*;

public class City {
  private double x, y;
  private String name;

  // Constructor
  public City(String pName, double pX, double pY){
    name = pName;
    x = pX;
    y = pY;
  }

  public String name(){
    return(name);
  }

  public double distanceTo(City other){
    //(x2-x1) a^2+b^2=c^2
    return(2.0);
  }

  public double x(){
    return(x);
  }

  public double y(){
    return(y);
  }
}
