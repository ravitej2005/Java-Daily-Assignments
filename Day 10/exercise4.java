class exercise4 {
  public static void main(String[] args){
    for(int i=1;i<=4;i++){
      int count=6-i;
      for(int j=1;j<=5-i;j++){
        if (i==4) {
          count = 1;
          System.out.print(count+" ");
          continue;
        }
        System.out.print((count--)+" ");
      }
      System.out.println();
    }
  }  
}
