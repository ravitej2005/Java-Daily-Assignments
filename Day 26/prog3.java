class prog3 {
  public static void main(String[] args) {
    for (int i = 1; i <= 100; i++) {
      int sum=0;
      for (int j = 1; j < i; j++) {
        if (i%j==0) {
          sum+=j;
        }
      }
      if (sum==i) {
        continue;
      }
      System.out.print(i+" ");
    }
  }
}