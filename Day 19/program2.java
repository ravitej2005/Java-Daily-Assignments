import java.util.Scanner;

class program2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter rupees (rs.) : ");
    double rupees = sc.nextDouble();
    System.out.println("Dollar amount : $"+(rupees*0.0119));
    sc.close();
  }
} 