import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanStr = new Scanner(System.in);
        String pass;

        while ((pass = scanStr.nextLine()) != null) {
            for (int i = 0; i < pass.length(); i += 2) {
                char letter1 = pass.charAt(i), letter2 = pass.charAt(i + 1);
                int realValue = ((int) letter1 - 65 + ((int)letter2-65)*16);
                System.out.print((char)realValue);
            }
        }
    }
}
