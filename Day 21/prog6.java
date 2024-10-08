import java.util.Scanner;

class prog6 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter size of array : ");
    int size = sc.nextInt();
    int[] arr = new int[size];

    System.out.println("Enter elements of array...");
    for (int i = 0; i < arr.length; i++) {
      System.out.print("arr[" + i + "] = ");
      arr[i] = sc.nextInt();
    }

    System.out.print("Original array : ");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }

    for (int i = 0; i < arr.length / 2; i++) {
      int temp = arr[i];
      arr[i] = arr[arr.length - (i + 1)];
      arr[arr.length - (i + 1)] = temp;
    }

    System.out.print("\nReversed array : ");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }

  }
}
