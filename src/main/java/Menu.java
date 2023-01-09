import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        mainLoop:
        while (true) {
            System.out.println("Wybierz opcję: ");
            System.out.println("1: Dodaj film");
            System.out.println("2: Wyświetl film");
            System.out.println("3: Zakończ program");

            int input = scanner.nextInt();

            switch (input) {
                case 1:
                    System.out.println("Dodanie filmu");
                    break;

                case 2:
                    System.out.println("Wyświetlenie filmu");
                    break;

                case 3:
                    break mainLoop;

                default:
                    System.out.println("Błędny wybór");
            }


        }
    }
}
