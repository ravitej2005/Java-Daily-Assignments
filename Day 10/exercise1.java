class exercise1 {
  public static void main(String[] args){
    int counter=7;
    for(int i=1;i<=4;i++){
      for(int j=1;j<=i;j++){
        System.out.print(counter+" ");
        if (j==i) {
          continue;
        }
        counter--;
      }
      System.out.println();
    }
  }
}
