class exercise3 {
  public static void main(String[] args){
    for(int i=1;i<=4;i++){
      char ch1='A';
      char ch2='a';
      for(int j=1;j<=5-i;j++){
        if (i%2==1) {
          System.out.print((ch1++)+" ");
        } else {
          System.out.print((ch2++)+" ");
        }
      }
      System.out.println();
    }
  }
}
