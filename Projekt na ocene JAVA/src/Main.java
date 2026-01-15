import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int min = 10;
        int random = (int)(Math.random() * (max - min)) + min;
        int runs = 0;
        int liczba;

        do{
            System.out.println("Zgadnij liczbe od 1 do 10");
            liczba = sc.nextInt();
            if(liczba > random) System.out.println("Liczba jest mniejsza");
            if(liczba < random) System.out.println("Liczba jest wieksza");
            int proby = runs++;
        }while (random != liczba);

        {
            System.out.println("Udało ci się! Ta liczba to: " + random);
            System.out.println("Liczba prób to: " + runs);
        }
    }
}