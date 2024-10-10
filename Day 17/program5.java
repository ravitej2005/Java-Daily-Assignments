import java.util.Scanner;

class program5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter year : ");
    int year = sc.nextInt();
    while (!(year>=1 && year<=9999)) {
      System.out.println("Please enter valid year between 1 to 9999 : ");
      year = sc.nextInt();
    }
    
    boolean leapYear;
    if (year%400==0) {
      leapYear = true;
    } else if (year%4==0 && year%100!=0) {
      leapYear = true;
    } else {
      leapYear = false;
    }
    
    System.out.print("Enter month : ");
    int month = sc.nextInt();
    while (!(month>=1 && month<=12)) {
      System.out.print("Please enter valid month number between 1 to 12 : ");
      month = sc.nextInt();
    }
    
    System.out.print("Enter day : ");
    int day = sc.nextInt();
    while (!(day>=1 && day<=31)) {
      System.out.print("Please enter valid day between 1 to 31 : ");
      day = sc.nextInt();
    }

    if ((month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12) && day<=31) {
      System.out.println(day+"\\"+month+"\\"+year+"\nValid date");
    } else if ((month==4 || month==6 || month==9 || month==11) && day<=30) {
      System.out.println(day+"\\"+month+"\\"+year+"\nValid date");
    } else if (month==2 && leapYear==true && day<=29) {
      System.out.println(day+"\\"+month+"\\"+year+"\nValid date");
    } else if (month==2 && leapYear==false && day<=28) {
      System.out.println(day+"\\"+month+"\\"+year+"\nValid date");
    } else {
      System.out.println(day+"\\"+month+"\\"+year+"\nDate doesn't exist");
    }
    sc.close();
  }
} 