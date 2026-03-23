void main() {
    GraWideo gierka = new GraWideo("Roblox", true, 1997, 0.0);

    IO.println("Tytuł: " + gierka.getTytul());
    IO.println("Cena: " + gierka.getCena());
    IO.println("Rok wydania: " + gierka.getRokWydania());
    IO.println("Czy jest multiplayer: " + gierka.getCzyMultiplayer());
    IO.println("Wiek gry: " + gierka.obliczWiek(gierka.getRokWydania()));

    gierka.setCena(-100.0);
    IO.println("Nowa cena: " + gierka.getCena());
}