import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello what is your name");

        String name = scanner.next();

        System.out.println("Hi "+name+" I'm JavaBot, where are you from?");

        String homeTown = scanner.next();

        System.out.println("I hear it's beautiful in "+homeTown+" I'm from a place called Oracle.");

        System.out.println("How old are you?");

        int age = scanner.nextInt();

        System.out.println("So you're "+age+", cool im 400 years old!");

        int math = 400/age;

        System.out.println("That means im "+math+" times older than you.");

        System.out.println("Enough about me, whats your favorite language, (just dont say Python).");

        String favoriteLanguage = scanner.next();

        System.out.println(favoriteLanguage +" thats great! I have to log off now, see you soon!!");
    }
    
}
