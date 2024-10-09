class prog4 {
  public static void main(String[] args) {
    int counter = 7;
    for (int i = 1; i <= 4; i++) {
      for (int j = 1; j <= 5-i; j++) {
        System.out.print(counter+" ");
        counter+=7;
      }
      System.out.println();
    }    
  }
}
