import java.util.Scanner;

class prog5 {
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

    System.out.print("\nReverse printed array : ");
    for (int i = arr.length-1; i >=0 ; i--) {
      System.out.print(arr[i] + " ");
    }
    sc.close();
  }
}
