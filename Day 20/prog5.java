import java.util.Scanner;

class prog5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] arr = new int[5];
    System.out.println("Enter elements of array...");
    for (int i = 0; i < arr.length; i++) {
      System.out.print("arr[" + i + "] = ");
      arr[i] = sc.nextInt();
    }

    // System.out.print("Elements of array before sort: ");
    // for (int i = 0; i < arr.length; i++) {
    // System.out.print(arr[i]+" ");
    // }

    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[j] < arr[i]) {
          int temp = arr[j];
          arr[j] = arr[i];
          arr[i] = temp;
        }
      }
    }

    // System.out.print("Elements of array after sort: ");
    // for (int i = 0; i < arr.length; i++) {
    // System.out.print(arr[i]+" ");
    // }

    System.out.println("Largest element in array is : " + arr[arr.length - 1]);
  }
}
