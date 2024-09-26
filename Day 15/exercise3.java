import java.util.Scanner;

class exercise3 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Distance (meters) : ");
    double dist = sc.nextDouble();
    System.out.print("Enter Time (seconds) : ");
    double time = sc.nextDouble();
    double velo = dist/time;
    System.out.println("Velocity of a particle roaming in space is "+velo+"m/s");
    }
  }

