import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        String tekst;

        System.out.println("Podaj 1 liczbę: ");
        a = scanner.nextInt();
        System.out.println("Podaj 2 liczbę: ");
        b = scanner.nextInt();
        System.out.println("Podaj 3 liczbę: ");
        c = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Podaj swój tekst:");
        tekst = scanner.nextLine();
        System.out.println("\n");

        System.out.println("Suma liczb a i b to: " + add(a, b));
        avg(a, b, c);
        pokaz(tekst);
    }

    public static int add(int a, int b){
        return a + b;
    }
    public static void avg(int a, int b, int c){
        float average;
        average = (float)(a + b + c)/3;
        System.out.println("Średnia równa się: " + average);
    }
    public static void pokaz(String text){
        System.out.println("---------");
        System.out.println(text);
        System.out.println("---------");
    }
}