import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in); <-- dodanie wczytywania zmiennych
        int[] table = {1, 3, 5};
        int[] liczby = new int[3];      // tabela ze stworzonymi 3 komórkami
        //String[] owoce = {"banan", "truskawka", "japko"};
        //System.out.println(Arrays.toString(owoce));   <-- wyświetlanie całej zawartości tabeli za pomocą komendy
        //for (int i : table){   <-- pętla for each
        for (int i=0; i<3; i++){
            //System.out.println(i);   <-- to jest do for each
            System.out.println(table[i]); //  <-- to jest do zwykłej pętli
        }
    }
}