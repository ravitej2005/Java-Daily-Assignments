class prog4 {
  public static void main(String[] args) {
    int counter = 10;
    for (int i = 1; i <= 4; i++) {
      for (int j = 1; j <= 4; j++) {
        if (j<=4-i) {
          System.out.print("\t\t");
        } else {
          System.out.print((counter*(counter--))+"\t\t");
        }
      }
      System.out.println();
      System.out.println();
    }
  }
}