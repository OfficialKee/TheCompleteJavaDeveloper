import java.util.Scanner;

public class JavaGram {

  public static void  main(String[] args){

    System.out.println("What is your name");
  
    Scanner scanner = new Scanner(System.in);

    String name = scanner.next();

    System.out.println("What is your last name?");

    String lastName = scanner.next();

    System.out.println("How old are you?");

    int age = scanner.nextInt();

    System.out.println("Make a user name.");

    String userName = scanner.next();

    System.out.println("What city do you live in?");

    String city = scanner.next();

    System.out.println("What country is that");

    String country = scanner.next();


    System.out.println("Thank you for joining JavaGram");

    System.out.println("\nHere is the information you entered");

    System.out.println("\tFirst Name: " +name);
    
    System.out.println("\tLast Name: " +lastName);
   
    System.out.println("\tAge: " +age);
    
    System.out.println("\tUser name: " +userName);
    
    System.out.println("\tCity: " +city);
    System.out.println("\tCountry: " +country);








    
  }
}
