import java.util.Scanner;

class prog5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int arr[] = {10,20,30,40,50};
    System.out.print("Array: ");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i]+" ");
    }

    System.out.print("\nEnter value : ");
    int a = sc.nextInt();
    boolean isPresent = false;

    for (int i = 0; i < arr.length; i++) {
      if (a==arr[i]) {
        isPresent = true;
        break;
      }
    }

    if (isPresent) {
      System.out.println("Found");
    } else {
      System.out.println("Not found");
    }
  }
}