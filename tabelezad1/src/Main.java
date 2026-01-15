import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //int[] table = new int[5];
        int[] table = {1, 2, 3, 4, 5};
        int suma=0, srednia=0;

        for (int i=0; i< table.length; i++) {
            //System.out.print("Podaj " + (i+1) + " liczbe:");
            //table[i] = scanner.nextInt();
            suma += table[i];
        }
        srednia = suma / table.length;

        System.out.println("Suma = " + suma);
        System.out.println("Srednia = " + srednia);
    }
}