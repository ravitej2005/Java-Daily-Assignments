class exercise1{
  public static void main(String[] args) {
    int a=10;
    int b=20;
    int c=30;
    
    int largest = 0;
    int secondLargest = 0;

    if (a>largest) {
      secondLargest = largest;
      largest = a;
    } else if (a>secondLargest) {
      secondLargest = a;
    }

    if (b>largest) {
      secondLargest = largest;
      largest = b;
    } else if (b>secondLargest) {
      secondLargest = b;
    }

    if (c>largest) {
      secondLargest = largest;
      largest = c;
    } else if (c>secondLargest) {
      secondLargest = c;
    }
    

    System.out.println("Second largest number is : "+secondLargest);
  }
}