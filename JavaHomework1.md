# T2.6 Sum the digits

```
import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 1000:");
        int number = scanner.nextInt();
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }
        System.out.println("The sum of the digits is " + sum);
        scanner.close();
    }
}
```

# T5.20 DIsplay Prime Number

```
public class DIsplayPrimeNumber {
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else
            return gcd(b, a % b);
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (gcd(n, i) > 1) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int count = 0;
        for (int i = 2; i <= 1000; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
                count++;
                if (count % 8 == 0)
                    System.out.println();
            }
        }
    }
}
```

# T5.34 RockScissorPaperGame

```
import java.util.Scanner;
import java.util.Random;

public class RockScissorPaperGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int userWin = 0;
        int computerWin = 0;

        while (Math.abs(userWin - computerWin) < 2) {
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
                userWin++;
            } else {
                System.out.println("Computer won");
                computerWin++;
            }
        }
        if (userWin > computerWin) {
            System.out.println("You won the series.");
        } else {
            System.out.println("Computer won the series.");
        }
    }
}
```

# T3.17 RockScissorPaper

```
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
            System.out.println("You win!");
        } else {
            System.out.println("Computer wins!");
        }
        scanner.close();
    }
}

```

# T6.18 Check password

```
import java.util.Scanner;

public class CheckPassword {
    public static boolean CheckVaildPassword(String password) {
        if (password.length() < 8) {
            return false;
        }
        int countDigit = 0;
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (!Character.isLetterOrDigit(c)) {
                return false;
            }
            if (Character.isDigit(c)) {
                countDigit++;
            }
        }
        return countDigit >= 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your password:");
        String password = scanner.nextLine();
        if (CheckVaildPassword(password)) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }
    }
}
```

# T6.30 Craps

```
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
```
