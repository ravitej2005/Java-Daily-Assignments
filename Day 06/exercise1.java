class exercise1{
  public static void main(String[] args) {
    int a=10;
    int b=20;
    int c=30;
    
    if ((a>b && b>c)||(a<b && b<c)) {
      System.out.println("b = "+b+" is the second largest ");
    } else if ((a>c && c>b)||(a<c && c<b)) {
      System.out.println("c = "+c+" is the second largest ");
    } else{
      System.out.println("a = "+a+" is the second largest ");
    }
  }
}