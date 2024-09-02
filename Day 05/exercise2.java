class exercise2{
  public static void main(String[] args) {
    int a = 20;
    int b = 30;
    int c = 40;
    if (a<b && a<c) {
      System.out.println(a+" is smallest");
    } else if (b<c && b<a) {
      System.out.println(b+" is smallest");
    } else if (c<a && c<b) {
      System.out.println(c+" is smallest");
    } else {
      System.out.println("a=b=c");
    }
  }
}