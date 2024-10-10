import java.util.Scanner;

class prog3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Distance in KM: ");
    float dist = sc.nextFloat();
    System.out.println(dist+" KM is equal to "+(dist*1000)+" meters");
    sc.close();
  }
}
