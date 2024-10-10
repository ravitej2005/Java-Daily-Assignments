import java.util.Scanner;

class program3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Ohms Law (V = I*R)");
    System.out.print("Input current(I) :");
    Double I = sc.nextDouble();

    System.out.print("Input resistance(R) :");
    Double R = sc.nextDouble();

    System.out.println("Voltage V = "+(I*R));
    sc.close();
  }
}
