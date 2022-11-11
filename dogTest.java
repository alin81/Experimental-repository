import java.util.Scanner;
import java.util.*;

class Main {
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);
    String name = "";
    Boolean dog = false;
    int age = 0;
    double avg = 12;
    
    System.out.print("What is your dog's name? ");
    name = keyboard.nextLine();
    System.out.print("Is your dog healthy?(True/False) ");
    dog = Boolean.parseBoolean(keyboard.nextLine());
    System.out.print("How old is your dog? ");
    age = Integer.parseInt(keyboard.nextLine());

    avg = avg-age;

    System.out.print(name+" has "+avg+" years to live. ");

    if (avg<5) {
      System.out.print("Oh no");
    } else {
      System.out.print("Good for you");
    }





  /////////// End of the tasks /////////////////
  } // end of method
} // end of class
