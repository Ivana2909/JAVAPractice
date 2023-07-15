package domaci12;

public class Tocak {
    //Napraviti klasu Tocak koja ce imati atribute za trajanje gume u danima(koliko je dana proslo
    //od kako smo postavili gumu), ostecenje(boolean) i cena.
        private int trajanjeGume;
        private boolean ostecenje;
        private double cena;

    public Tocak(int trajanjeGume, boolean ostecenje, double cena) {
        this.trajanjeGume = trajanjeGume;
        this.ostecenje = ostecenje;
        this.cena = cena;
    }

    public Tocak() {
    }

    public int getTrajanjeGume() {
        return trajanjeGume;
    }

    public void setTrajanjeGume(int trajanjeGume) {
        this.trajanjeGume = trajanjeGume;
    }

    public boolean isOstecenje() {
        return ostecenje;
    }

    public void setOstecenje(boolean ostecenje) {
        this.ostecenje = ostecenje;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder();
        sb.append(" Guma moze da traje bez ostecenja: ").append(getTrajanjeGume()).append(" dana").append(" i kosta ").append(getCena());
        return sb.toString();
    }
}
