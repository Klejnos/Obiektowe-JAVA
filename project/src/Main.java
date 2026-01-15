import java.util.Arrays;
public class Main {

    // UZUPEŁNIJ TUTAJ: Definicja metody findMinMaxAndPrint
    public static void findMinMaxAndPrint(int[] dane) {
        // Implementacja pętli i logiki znajdowania Min i Max
        int max = dane[0];
        int min = dane[0];
        int maxIndex = 0;
        int minIndex = 0;

        for(int i=0; i< dane.length; i++){
            if(max < dane[i]){
                max = dane[i];
                maxIndex = i;
            }
            if(min > dane[i]) {
                min = dane[i];
                minIndex = i;
            }
        }
        System.out.println("Maksymalna wartość: " + max + " (Indeks: " + maxIndex + ")");
        System.out.println("Minimalna wartość: " + min + " (Indeks: " + minIndex + ")");
    }

    public static void main(String[] args) {
        int[] data = {12, 5, 45, 8, 30, 1};

        System.out.println("Analiza tablicy: " + Arrays.toString(data));

        // Wywołanie uzupełnionej metody
        findMinMaxAndPrint(data);
    }
}