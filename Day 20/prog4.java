class prog4 {
  public static void main(String[] args) {
    for (int i = 1; i <= 4; i++) {
      for (int j = 1; j <= 5-i; j++) {
        if (j%2==1) {
          System.out.print("+ ");
        } else {
          System.out.print("= ");
        }
      }
      System.out.println();
    }
  }
}
