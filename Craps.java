import java.util.Random;

public class Craps {
    public static int Roll() {
        Random random = new Random();
        return random.nextInt(6) + 1;
    }

    public static void main(String[] args) {
        int die1 = Roll();
        int die2 = Roll();
        int sum = die1 + die2;
        System.out.println("You rolled " + die1 + " + " + die2 + " = " + sum);

        if (sum == 2 || sum == 3 || sum == 12) {
            System.out.println("You lose");
        } else if (sum == 7 || sum == 11) {
            System.out.println("You win");
        } else {
            int point = sum;
            System.out.println("Point is " + sum);
            while (true) {
                int die3 = Roll();
                int die4 = Roll();
                int sum2 = die1 + die2;
                System.out.println("You rolled " + die1 + " + " + die2 + " = " + sum);
                if (sum2 == 7) {
                    System.out.println("You lose");
                    break;
                } else if (sum2 == point) {
                    System.out.println("You win");
                    break;
                }
            }
        }
    }
}
