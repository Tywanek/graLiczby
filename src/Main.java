import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        int randomNumber = random.nextInt(100);

        int userNumber = 0;
        boolean isWin = false;
        boolean isNuberOk = false;

        while (!isWin) {
            try {
                isNuberOk = false;
                System.out.println("Podaj liczbe: ");
                userNumber = new Scanner(System.in).nextInt();
                System.out.println("Liczba jest ok");
                isNuberOk = true;
            } catch (Exception e) {
                System.out.println("To nie jest liczba. ");
            }

            if (userNumber == randomNumber) {
                isWin = true;
                System.out.println("You win!");
            }
            if (isNuberOk && userNumber > randomNumber) {
                System.out.println("mniejsza");
            }
            if (isNuberOk && (userNumber < randomNumber)) {
                System.out.println("wieksza");
            }
        }
    }
}
