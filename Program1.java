class Program1 extends ConsoleProgram {

  /**
  * Compute the distance between two points
  * @author: E. Fabroa
  */
  
  public void run() {

    int intX1, intX2;
    int intY1, intY2;
    double dblDist;

    intX1 = readInt("Enter x1: ");
    intY1 = readInt("Enter Y1: ");

    intX2 = readInt("Enter x2: ");
    intY2 = readInt("Enter Y2: ");

    dblDist = getDistance(intX1, intY1, intX2, intY2);
    System.out.println("This distance between points is " + distance);

  }


 /**
  * Computes the distance between two points
  * @param x_1 x value of the first point
  * @param y_1 y value of the first point
  * @param x_2 x value of the second point
  * @param y_2 x value of the second point
  * @return the distance between the two points
  */
  private double getDistance(int x_1, int y_1, int x_2, int y_2) {
    
    double distance = Math.sqrt(Math.pow(x_2 - x_1,2)+ Math.pow(y_2 - y_1,2));
    return distance;
    
  }

}
