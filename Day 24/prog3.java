import java.util.Scanner;

class prog3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] arr = new int[10];
    System.out.println("Input elements : ");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
      if (arr[i] < 0) {
        System.out.println("Negative Number Entered, Exiting The Loop!");
        sc.close();
        return;
      }
    }
    System.out.println("No negative number found. Printing the elements....");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    sc.close();
  }
}
