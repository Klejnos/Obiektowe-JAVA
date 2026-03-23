public class GraWideo {
    private String Tytul;
    private Boolean CzyMultiplayer;
    private int RokWydania;
    private double Cena;

    GraWideo(String Tytul, Boolean CzyMultiplayer, int RokWydania, double Cena) {
        this.Tytul = Tytul;
        this.Cena = Cena;
        this.CzyMultiplayer = CzyMultiplayer;
        this.RokWydania = RokWydania;
    }

    GraWideo() {
        this.Tytul = "Fajna gra";
        this.Cena = 100.00;
        this.RokWydania = 2026;
        this.CzyMultiplayer = false;
    }

    public String getTytul() {
        return this.Tytul;
    }

    public void setTytul(String tytul) {
        this.Tytul = tytul;
    }

    public double getCena() {
        return this.Cena;
    }

    public void setCena(double cena) {
        if (cena < 0) {
            this.Cena = 0;
        }
        else {
            this.Cena = cena;
        }
    }

    public Boolean getCzyMultiplayer() {
        return this.CzyMultiplayer;
    }

    public void setCzyMultiplayer(Boolean czyMultiplayer) {
        this.CzyMultiplayer = czyMultiplayer;
    }

    public int getRokWydania() {
        return this.RokWydania;
    }

    public void setRokWydania(int rokWydania) {
        this.RokWydania = rokWydania;
    }

    public int obliczWiek(int rokWydania) {
        int aktualnyRok = 2026;
        return aktualnyRok - this.RokWydania;
    }
}