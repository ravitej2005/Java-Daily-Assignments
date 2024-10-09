import java.util.Scanner;

class prog3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Distance in feet: ");
    float dist = sc.nextFloat();
    System.out.println(dist+" feet is equal to "+(dist*30)+" centimeters");
  }
}
