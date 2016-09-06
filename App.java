import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console console = System.console();

    System.out.println("Input a length for side one of our triangle:");
    String inputStringSide1 = console.readLine();
    int inputSide1 = Integer.parseInt(inputStringSide1);

    System.out.println("Input a length for side two of our triangle:");
    String inputStringSide2 = console.readLine();
    int inputSide2 = Integer.parseInt(inputStringSide2);

    System.out.println("Input a length for side three of our triangle:");
    String inputStringSide3 = console.readLine();
    int inputSide3 = Integer.parseInt(inputStringSide3);

    Triangle userTriangle = new Triangle(inputSide1, inputSide2, inputSide3);

    String type = userTriangle.triangleType();
    if(type.equals("not a triangle!")) {
      System.out.println("This is " + type);
    } else {
      System.out.println("You have created a " + type + " triangle.");
    }
  }
}
