package domaci10;

public class Radnik {
    //Napraviti klasu Radnik koja ce imati atribute za ime, broj odradjenih sati u nedelji(double),
    //satnicu(double).
    //Naraviti klase Masinovodja, Fizikalac i SefSmene koji ce nasledjivati klasu Radnik.
    //SefSmene ce imati dodatni atribut za nedeljni bonus.
    //U klasi Radnik definisati dve metode:
    //1) Metoda koja vraca ukupno para zaradjeno za nedelju dana (Sefu Smene na ovu ukupnu
    //zaradu dodajemo nedeljni bonus).
    //2) Metoda koja govori da li je radnik na odmoru, Fizikalac je na odmoru ako ima vise od 40
    //odradjenih sati u nedelju, Masinovodja 30 a Sef smene 50 radnih sati.
    //Za sve klase je potrebno definisati konstruktor, odgovarajuce get i set metode kao i toString()
    private String ime;
    private double brSati;
    private double satnica;

    public Radnik(String ime, double brSati, double satnica) {
        this.ime = ime;
        this.brSati = brSati;
        this.satnica = satnica;
    }

    public double UkuZarada() {
        double zarada = brSati * satnica;
        return zarada;
    }



    public void Odmor() {

    }


        public String getIme () {
            return ime;
        }

        public void setIme (String ime){
            this.ime = ime;
        }

        public double getBrSati () {
            return brSati;
        }

        public void setBrSati ( double brSati){
            this.brSati = brSati;
        }

        public double getSatnica () {
            return satnica;
        }

        public void setSatnica ( double satnica){
            this.satnica = satnica;
        }

    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder();
        sb.append(getIme()).append(" radi ").append(getBrSati()).append(" sati za dnevnicu od ")
                .append(getSatnica()).append(" din/h i ima zaradu od: ").append(UkuZarada()).append(" dinara.");
        return sb.toString();
    }
}

