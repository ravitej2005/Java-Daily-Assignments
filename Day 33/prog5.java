import java.util.Scanner;

class prog5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number : ");
    int num = sc.nextInt();
    int tmp = num;
    int primeDigits[] = new int[10];
    int counter = 0;
    while (tmp!=0) {
      boolean isPrime = true;
      int digit = tmp%10;
      for (int i = 2; i < digit; i++) {
        if (digit%i==0) {
          isPrime = false;
        }
      }
      if (isPrime) {
        primeDigits[counter] = digit;
        counter++;
      }
      tmp/=10;
    }
    System.out.print("The prime digits from the number "+num+" are ");
    for (int i = 0; i < counter; i++) {
      System.out.print(primeDigits[i]+" ");
    }
    sc.close();
  }
}