class exercise4 {
  public static void main(String[] args){
    for(int i=1;i<=4;i++){
      for(char j=65;j<=(65+4)-i;j++){
        System.out.print(j+" ");
      }
      System.out.println();
    }
  }  
}
