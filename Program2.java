class Program2 extends ConsoleProgram {

  /**
  * Compute the distance between two points
  * @author: E. Fabroa
  */

  int width;
  int height;
  
  public void run() {

    String colour;

    colour = readLine("Enter a colour: ");
    width = readInt("Enter the width: ");

    height = readInt("Enter the height: ");
  
    System.out.println("The " + colour + " rectangle's area is " + getArea());
    System.out.println("The " + colour + " rectangle's perimeter is " + getPerimeter());

  }

  /**
   * Compute the area of a rectangle
   * @return the area of the rectangle
   * @author: E. Fabroa
   */
  private int getArea() {
    int width = 0;
    return width * height;
  }

  /**
   * Compute the perimeter of a rectangle
   * @return the perimeter of the rectangle
   * @author: E. Fabroa
   */
  private int getPerimeter(){
    int width2 = width * 2;
    int height2 = height * 2;

    return width2 + height2;
  }
  
}
