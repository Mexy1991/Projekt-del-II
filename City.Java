import java.util.*;

public class City {
  private String name;
  private double x, y;

  // Constructor
  public City(String parameterName, double parameterX, double parameterY){
    name = parameterName;
    x = parameterX;
    y = parameterY;
  }

  public String name(){
    return(name);
  }

  public double distanceTo(City other){
    //(x2-x1) a^2+b^2=c^2
    double distance = Math.sqrt((other.x()-x())*(other.x()-x()) + (other.y()-y())*(other.y()-y()));
    return(distance);
  }

  public double x(){
    return(x);
  }

  public double y(){
    return(y);
  }
}
