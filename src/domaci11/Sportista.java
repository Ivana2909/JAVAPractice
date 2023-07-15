package domaci11;

public class Sportista {
    //1)Napraviti klasu Sportista koji ima atribute za ime, jmbg i platu.
    //2)Napraviti klasu SportskiKlub koja ima listu clanova kluba, naziv grada odakle je klub i
    //budzet kluba. Definisati metode:
    // *isplati - koja vraca kolicinu novca koja ostaje kada se svim clanovima kluba isplate
    //plate.
    // *prosecnoPlaceni - vraca prosecnu platu svih sportista iz liste.
    // *removePreplaceni - izbacuje iz liste sportistu koji je placen vise od proseka.
    //3) Napraviti klase Manchester, Arsenal, Spartak koja nasledjuje klasu SportskiKlub.
    //Napraviti main metodu gde ce se testirati sve funkcionalnosti, takodje definisati za sve klase
    //potrebne konstruktore, get i set metode kao i toString()

    private String ime;
    static int JMBG;
    private int jmbg;
    private double plata;

    public Sportista(String ime, int JMBG, double plata) {
        this.ime = ime;
        this.JMBG = JMBG;
        this.plata = plata;
        jmbg=JMBG;
        JMBG++;
    }


    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public int getJMBG() {
        return JMBG;
    }

    public void setJMBG(int JMBG) {
        this.JMBG = JMBG;
    }

    public double getPlata() {
        return plata;
    }

    public void setPlata(double plata) {
        this.plata = plata;
    }

    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder();
        sb.append(getIme()).append(" sa JMBGom: ")
                .append(getJMBG()).append(" ima platu od: ").append(getPlata()).append(" dinara");
        return sb.toString();
    }
}
