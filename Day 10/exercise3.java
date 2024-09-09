class exercise3 {
  public static void main(String[] args){
    for(int i=1;i<=4;i++){
      int counter=i;
      for(int j=1;j<=4;j++){
        if (j<=4-i) {
          System.out.print("  ");
        } else {
          System.out.print((counter--)+" ");
        }
      }
      System.out.println();
    }
  }  
}
