class prog3 {
  public static void main(String[] args) {
    for (int i = 1; i <= 100; i++) {
      if ((i&1)==0) {
        continue;
      }
      System.out.print(i+" ");
    }
  }
}
