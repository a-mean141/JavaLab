import java.util.*;

// An exploration of basic input and output.
class BasicIO {

  // Reads and processes string input.
  public static void main(String[] args) {

    try (Scanner stdin = new Scanner(System.in)) {
      // get first input
      System.out.print("Enter your name: ");
      String name = stdin.nextLine();
      System.out.print("Enter your age: ");
      int years = stdin.nextInt();
      System.out.print("Enter your height: ");
      int height = stdin.nextInt();

      // display output on console
      System.out.println("your name is " + name);
      System.out.println("your age is " + years);
      System.out.printf("2005�� 09�� 06�� ���� %s(%d)�� Ű�� %d cm �Դϴ�.\n", name, years, height);

      System.out.println(365 * years);
    }

  } // method main

} // class BASIC_IO
