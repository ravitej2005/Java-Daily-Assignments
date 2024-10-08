import java.util.Scanner;

class prog1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Input : ");
    int num = sc.nextInt();
    if (isPrime(num)) {
      System.out.println(num+" is Prime Number");
    } else {
      System.out.println(num+" is Not Prime Number");
    }
  }

  static boolean isPrime(int a){
    for (int i = 2; i < a; i++) {
      if (a%i==0) {
        return false;
      }
    }
    return true;
  }
}