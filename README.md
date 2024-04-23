# 3.6.2 Run-Time Errors and Exceptions

Run-time errors are errors that occur while your program runs. Syntactically the program may be correct, however, these typically occur when your program attempts an operation that is impossible to carry out.

An example of this is division by zero. Suppose you had the following program:
```java
class Speed extends ConsoleProgram {
    public void run() {
        // Declare variables
        int speed;
        int distance;
        int hours;

        // Get distance and hours from user
        distance = readInt("Enter the distance travelled: ");
        hours = readInt("Enter the hours elapsed: ");

        // Calculate speed
        speed = distance/hours;

        // Output speed
        System.out.println("The speed is " + speed);
    }
}
```

If the variable hours has a value of 0, the division operation fails and causes a run-time error. The program must run in order for this error to be detected, and if hours contains a valid value, it will not occur at all.

Some other examples:
* incorrect data type entered (i.e double inputted when int expected)
* square root of a negative number
* referring to an invalid index of a String when doing substring

## Dealing with Run-Time Errors

### Exception Handling
One option for handling run-time errors is to detect cases where run-time errors would occur and build in conditions to handle those cases.  

### Exception Handling General Form
```java
try {
    // code to execute
}	
catch (type-of-exception id) {
    // code the handle exception
}
```

The set of statements in the curly brakets following the `try` keyword is called the **try clause**.  The set of statements in the curly brakets following the `catch` keyword is called the **catch clause**.

## Example: SpeedException.java
We ran the above program with hours 0 and had the `ArithmeticException` error appear. We can include this error in our catch statement.

```java
class SpeedException extends ConsoleProgram {
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
      catch (ArithmeticException e) {
        System.out.println("Invalid input. Hours must be greater than 0.");
      }
    }
}
```

We can also utilize the `error` variable to get details on the error.

```java
try {
   speed = distance/hours;
   System.out.println("The speed is " + speed);
}
catch (ArithmeticException e){
   System.out.println("The monkeys have detected an issue: " + e.getMessage());
}
```

## Example: ConsoleProgram readDouble()

A good example of usage of `try-catch` exception handling is in the CodeHS implementation of `readDouble()` inside `ConsoleProgram.java`.

```java
public double readDouble(String prompt){

    while (true) {
        String input = readLine(prompt);
        try {
            double n = Double.valueOf(input).doubleValue();
            return n;
        }
        catch (NumberFormatException e) {

        }
    }
}
```

### More Examples

You can see the list of [built-in exceptions examples here](http://www.geeksforgeeks.org/types-of-exception-in-java-with-examples/)


## Methods, Preconditions and Throwing Exceptions

### Preconditions
By convention, **preconditions** on public methods are enforced by explicit checks inside methods resulting in particular, specified exceptions. For example:

```java
  /**
   * Sets the refresh rate.
   *
   * @param  rate refresh rate, in frames per second.
   * @throws IllegalArgumentException if rate <= 0 or rate > 100.
   */
  public void setRefreshRate(int rate) {
    // Enforce specified precondition in public method
    if (rate <= 0 || rate > 100) {
      throw new IllegalArgumentException("Illegal rate: " + rate);
    }
    System.out.println("Rate set to:");
  }
```