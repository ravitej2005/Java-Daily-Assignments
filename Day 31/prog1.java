import java.util.Scanner;

class prog1{  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number : ");
    int num = sc.nextInt();
    for (int i = 1; i <= num; i++) {
      int tmp = i;
      int sum = 0;
      while (tmp!=0) {
      int factorial = 1;
      int digit = tmp%10;        
      for (int j = 1; j <= digit; j++) {
        factorial *= j;
      }
      sum+=factorial;
      tmp/=10;
    }
    if (sum==i) {
      System.out.print(i+" ");
    }
  }
    sc.close();
  }
}