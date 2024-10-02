class program4 {
  public static void main(String[] args) {
    int count=7;
    for (int i = 1; i <= 4; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(count+" ");
        if (j==i) {
          continue;
        }
        count--;
      }
      System.out.println();
    }
  }
}
