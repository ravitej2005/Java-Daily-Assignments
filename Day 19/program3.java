class program3 {
  public static void main(String[] args) {
    char ch = 'A';
    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= 6-i; j++) {
        System.out.print(ch+" ");
      }
      ch++;
      System.out.println();
    }
  }
}
