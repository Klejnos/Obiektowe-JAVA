import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //String[] owoce = {"japko", "banan", "kokos"};
        //System.out.println(Arrays.toString(owoce));
        //for (int i = 0; i<owoce.length; i++){
        //    System.out.println(owoce[i]);
        //}
        //for (String n : owoce){
        //    System.out.println(n);
        //}

        int[] liczby = new int[3];
        liczby[0] = 10;
        liczby[1] = 15;
        liczby[2] = 25;

        System.out.println(liczby.length);

        for (int i=0; i<liczby.length; i++){
            System.out.println("Liczba w tablicy " + (i+1) + " = " + liczby[i]);


        }

    }
}

