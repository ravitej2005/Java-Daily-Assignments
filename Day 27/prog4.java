class prog4 {
  public static void main(String[] args) {
    for (int i = 1; i <= 4; i++) {
      char ch = 'A';
      for (int j = 1; j <= 4; j++) {
        if (j<=4-i) {
          System.out.print("  ");
        } else {
          System.out.print(ch+" ");
          ch++;
        }
      }
      System.out.println();
    }
  }
}