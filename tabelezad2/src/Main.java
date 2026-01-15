public class Main {
    public static void main(String[] args) {

        int[] table = {1, 2, 3, 4, 5};
        int mnozeznie_nieparzystych = 1, od_tysiaca = 1000;
        int suma=0, srednia=0;

        for (int i=0; i< table.length; i++) {
            suma += table[i];
            if(table[i]%2!=0){
                mnozeznie_nieparzystych *= table[i];
            }
            else if(table[i]%2==0){
                od_tysiaca -= table[i];
            }
        }
        srednia = suma / table.length;

        System.out.println("Suma = " + suma);
        System.out.println("Srednia = " + srednia);
        System.out.println("Pomnożone liczby nieparzyste = " + mnozeznie_nieparzystych);
        System.out.println("Po odjęciu liczb parzystych od 1000 wychodzi = " + od_tysiaca);
    }
}