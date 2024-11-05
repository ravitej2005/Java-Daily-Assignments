import java.util.Scanner;

class prog5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number : ");
    int num = sc.nextInt();
    int temp = num;
    int oddCount=0;
    int evenCount=0;
    while (temp!=0) {
      int rem = temp%10;
      if (rem%2==0) {
        evenCount++;
      } else {
        oddCount++;
      }
      temp/=10;
    }
    System.out.println("The number "+num+" has "+oddCount+" odd digits & "+evenCount+" even digits");
    sc.close();
  }
}