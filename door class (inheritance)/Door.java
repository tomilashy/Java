import java.util.Scanner;

public class Door {
  Scanner Door = new Scanner(System.in);

  public int enterCombination() {
    System.out.println("What is the code");
    int code = Door.nextInt();
    Door.close();
    return code;

  }

  public String open() {
    return "DOOR IS OPEN";
  }
}
