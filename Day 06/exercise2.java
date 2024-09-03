class exercise2 {
  public static void main(String[] args) {
    int math = 98;
    int physics = 78;
    int chemistry = 88;
    int english = 80;
    float percent = (math + physics + chemistry + english) / 4;
    System.out.println("Percent : " + percent);
    if (percent<=59) {
      System.out.println("Grade : F");
    } else if (percent<=69) {
      System.out.println("Grade : D");
    } else if (percent<=79) {
      System.out.println("Grade : C");
    } else if (percent<=89) {
      System.out.println("Grade : B");
    } else {
      System.out.println("Grade : A");
    }
  }
}
