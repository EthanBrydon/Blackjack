import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Game game = new Game(4);
    System.out.println("Welcome to Ethan's BlackJack Game!");

    System.out.println("Enter 'y' to play or 'n' if you do not wish to play.");
    String deal = sc.nextLine();
    if (deal.equals("y")) {
      while (deal.equals("y")) {
        game.runGame();
        System.out.println("Enter 'y' to continue playing or 'n' if you do not wish to play.");
        deal = sc.nextLine();
        if ((!deal.equals("y")) && (!deal.equals("n"))) {
          while ((!deal.equals("y")) && (!deal.equals("n"))) {
            System.out.println("Invalid Input!!!  Enter 'y' to continue playing or 'n' if you do not wish to play.");
            deal = sc.nextLine();
          }
        }
      }
    }
    System.out.println("Thanks for playing, Goodbye.");
  }
}