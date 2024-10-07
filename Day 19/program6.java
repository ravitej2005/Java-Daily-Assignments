import java.util.Scanner;

class program6 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] arr = new int[10];
    System.out.println("Enter elemets of array...");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.print("Even numbers : ");
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] % 2 == 0) {
        System.out.print(arr[i] + " ");
      }
    }
    System.out.print("\nOdd numbers : ");
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] % 2 == 1) {
        System.out.print(arr[i] + " ");
      }
    }
  }
}