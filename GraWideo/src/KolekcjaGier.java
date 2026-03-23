public class KolekcjaGier {
    private GraWideo[] gra = new GraWideo[5];

    public KolekcjaGier() {
        gra[0] = new GraWideo("Counter Strike 2", true, 2023, 0.0);
        gra[1] = new GraWideo("Teardown", true, 2017, 120.0);
        gra[2] = new GraWideo("Minecraft", true, 2010, 80.0);
        gra[3] = new GraWideo("Cities Skylines", false, 2015, 99.99);
        gra[4] = new GraWideo("GTA 5", true, 2013, 60.0);
    }

    public void wyswietlWszystko() {
        for (int i = 0; i < gra.length; i++) {
            IO.println(gra[i].getTytul() + " cena: " + gra[i].getCena() + "multiplayer: " + gra[i].getCzyMultiplayer() + " rok wydania: " + gra[i].getRokWydania());
        }
    }

    public void znajdzNajdrozszy() {
        GraWideo najdrozszy = gra[0]; // obiekt o takiej samej wartości jak gra[0]
        for (int i = 0; i < gra.length; i++) {
            if (najdrozszy.getCena() < gra[i].getCena()) {
                najdrozszy = gra[i];
            }
        }
        IO.println("Najdroższa gra: " + najdrozszy);
    }
}