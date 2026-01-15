import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int wybor;
        do {
            int a = 0;
            int b = 0;

            System.out.print("Podaj liczbę a: ");
            a = sc.nextInt();
            System.out.print("Podaj liczbę b: ");
            b = sc.nextInt();

            System.out.println("Co chcesz zribić?");
            System.out.println("1. Dodawanie");
            System.out.println("2. Odejmowanie");
            System.out.println("3. Mnożenie");
            System.out.println("4. Dzielenie");
            System.out.println("5. Wyjście");
            wybor = sc.nextInt();

            switch (wybor) {
                case 1: {
                    System.out.println("Suma: " + (a + b));
                    break;
                }
                case 2: {
                    System.out.println("Różnica: " + (a - b));
                    break;
                }
                case 3: {
                    System.out.println("Iloczyn: " + (a * b));
                    break;
                }
                case 4: {
                    System.out.println("Iloraz: " + ((double)a / b));
                    break;
                }
                case 5: {
                    System.exit(0);
                    break;
                }
                default:
                    System.out.println("Nie ma takiego wyboru");
            }
        }while (wybor != 5);
    }
}