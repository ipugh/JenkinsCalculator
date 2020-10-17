import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    Calculator calc = new Calculator();

    while (true) {
      String line = s.nextLine();
      String arr[] = line.split(" ");
      arr[0] = arr[0].toLowerCase();
      if(arr[0].equals("add")) {
        System.out.println(calc.add(Integer.parseInt(arr[1]), Integer.parseInt(arr[2])));
      } else if(arr[0].equals("subtract")) {
        System.out.println(calc.subtract(Integer.parseInt(arr[1]), Integer.parseInt(arr[2])));
      } else if(arr[0].equals("multiply")) {
        System.out.println(calc.multiply(Integer.parseInt(arr[1]), Integer.parseInt(arr[2])));
      } else if(arr[0].equals("divide")) {
        System.out.println(calc.divide(Integer.parseInt(arr[1]), Integer.parseInt(arr[2])));
      } else if(arr[0].equals("fibonnacinumberfinder")) {
        System.out.println(calc.fibonacciNumberFinder(Integer.parseInt(arr[1])));
      } else if(arr[0].equals("inttobinarynumber")) {
        System.out.println(calc.intToBinaryNumber(Integer.parseInt(arr[1])));
      }
    }

  }
}
