class prog4 {
  public static void main(String[] args) {
    for (int i = 1; i <= 4; i++) {
      int count = 3;
      for (int j = 1; j <= 4; j++) {
        if (j<=4-i) {
          System.out.print("   ");
        } else {
          System.out.print((count*count)+" ");
          count++;
        }
      }
      System.out.println();
    }
  }
}