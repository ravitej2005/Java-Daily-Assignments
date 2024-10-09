class prog1 {
  public static void main(String[] args) {
    boolean isPrime = false;
    for (int i = 1; i <= 100; i++) {
      if (isPrime(i)) {
        System.out.print(i+" ");
      }
    }
  }

  static boolean isPrime(int n){
    for (int i = 2; i < n; i++) {
      if (n%i==0) {
        return false;
      }
    }
    return true;
  }
}