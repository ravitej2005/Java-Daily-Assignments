class program4 {
  public static void main(String[] args) {
    int counter = 1;
    for (int i = 1; i <= 4 ; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print((counter*counter*counter)+" ");
        counter++;
      }
      System.out.println();
    }
  }
}
