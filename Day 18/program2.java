import java.util.Scanner;

class program2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter mass: ");
    int m = sc.nextInt();
    System.out.print("Enter velocity: ");
    int v = sc.nextInt();
    System.out.println("Kinetic Energy of that Object is:"+(double)(0.5*m*v*v));
  }
}
