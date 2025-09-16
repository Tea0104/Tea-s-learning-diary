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