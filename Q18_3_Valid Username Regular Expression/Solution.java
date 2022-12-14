import java.util.Scanner;
class UsernameValidator {
    static String b1 = "[a-zA-Z][a-zA-Z0-9_]{7,29}";  //RegularExpression for username
    public static final String regularExpression = b1;
}


public class Solution {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());  //
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {  //Check for username vaidation
                System.out.println("Valid");  //Print messages accordingly
            } else {
                System.out.println("Invalid");
            }
        }
    }
}
