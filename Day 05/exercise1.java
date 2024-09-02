class exercise1{
  public static void main(String[] args) {
    int a = 20;
    int b = 30;
    int c = 40;
    if (a>b && a>c) {
      System.out.println(a+" is greatest");
    } else if (b>c && b>a) {
      System.out.println(b+" is greatest");
    } else if (c>a && c>b) {
      System.out.println(c+" is greatest");
    } else {
      System.out.println("a=b=c");
    }
  }
}