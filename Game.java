import java.util.Random;
import java.util.Scanner;

public class Game {
  public static void main(String[] args) {
    int max = 50;
    int min = 1;
    int bomb = new Random().nextInt(max) + 1;
    int round = 0;
    Scanner scanner = new Scanner(System.in);
    int input = 0;
    do {
      scanner = new Scanner(System.in);
      round++;
      System.out.println("Round " + round + ": Please pick a number from " + min + " - " + max);
      input = scanner.nextInt();
      // Revise the number range for next round
      if (input < bomb) {
        min = input + 1;
      }
      if (input > bomb) {
        max = input - 1;
      }
    } while (input != bomb);
    scanner.close();
    System.out.println("Game End");
  }
}