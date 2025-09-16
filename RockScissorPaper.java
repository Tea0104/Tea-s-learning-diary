import java.util.Scanner;
import java.util.Random;

public class RockScissorPaper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("scissor (0), rock (1), paper (2): ");

        int userChoice = scanner.nextInt();
        int computerChoice = random.nextInt(3);

        String[] choices = { "scissor", "rock", "paper" };

        System.out.print("The computer is " + choices[computerChoice] + ". You are " + choices[userChoice] + ". ");

        if (userChoice == computerChoice) {
            System.out.println("It's a draw.");
        } else if ((userChoice == 0 && computerChoice == 2) ||
                (userChoice == 1 && computerChoice == 0) ||
                (userChoice == 2 && computerChoice == 1)) {
            System.out.println("You won");
        } else {
            System.out.println("Computer won");
        }
        scanner.close();
    }
}
