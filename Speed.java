class Speed extends ConsoleProgram {

  public void run() {
    // Declare variables
    int speed;
    int distance;
    int hours;

    // Get distance and hours from user
    distance = readInt("Enter the distance travelled: ");
    hours = readInt("Enter the hours elapsed: ");

    try {
    // Calculate speed
    speed = distance/hours;

    // Output speed
    System.out.println("The speed is " + speed);
    }
    catch (ArithmeticException e){
      System.out.println("Error detected: " + e.getMessage());
    }
    }
  }


