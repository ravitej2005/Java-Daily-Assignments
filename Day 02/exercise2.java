class exercise2 {
  public static void main(String[] args){
    int i=1;
    System.out.print("Even numbers : ");
    while (i<=20) {
      if (i%2==0) {
        System.out.print(i+" ");
      }
      i++;
    }

    i=1;
    System.out.print("\nOdd numbers : ");
    while (i<=20) {
      if (i%2==1) {
        System.out.print(i+" ");
      }
      i++;
    }
  }  
}
