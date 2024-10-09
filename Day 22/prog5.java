import java.util.Scanner;

class prog5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int arr[] = {10,20,30,40,50};
    System.out.println("Existing array: "+System.identityHashCode(arr));
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i]+" ");
    }
    int arr2[] = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
      arr2[i] = arr[i];
    }
    System.out.println("\n\nNew array: "+System.identityHashCode(arr2));
    for (int i = 0; i < arr2.length; i++) {
      System.out.print(arr2[i]+" ");
    }
  }
}