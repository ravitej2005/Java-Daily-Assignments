class exercise5 {
  public static void main(String[]args){
    int count = 1;
    for (int i = 1; i <= 3; i++) {
      for (int j = 1; j <= 4; j++){
        if (j%2==1) {
          System.out.print("* ");
        } else {
          System.out.print((count++)+" ");
        }
      }
      System.out.println();
    }
  }
}
