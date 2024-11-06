import java.util.Scanner;

class prog3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number : ");
    int num = sc.nextInt();
    int tmp = num;
    int counter=0;
    double average;
    double sum = 0;
    while (tmp!=0) {
      int digit = tmp%10;
      sum+=digit;
      counter++;
      tmp/=10;
    }
    average = sum/counter;
    System.out.println(" The Average of digits from number "+num+ " is "+average);
  }
}