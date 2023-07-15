package domaci8;

public class AutoSkola {
    //Napraviti klasu AutoSkola koja ima atribute za naziv, broj ljudi u autoskoli, cenu polaganja i
    //tip vozila za koje se polaze.
    //1) Napraviti metodu koja ce dati svima koji polazu za motor 50% popusta od cene polaganja.
    //2) Napraviti metodu koja ce nam vratiti koliko grupa ce imati Auto-skola ako znamo da
    //grupa mora imati bar petoro ljudi.
    //3) Ukoliko korisnik zeli da polaze za Autobus, ispisati poruku da to nije moguce u ovom
    //trenutku, u suprotnom ispisati da je polaganje moguce.
    //4) Sve rezultujuce objekte ispisati pomocu toString().

    String naziv;
    int brLjudi;
    double cena;
    String tipVozila;

    public AutoSkola(String naziv, int brLjudi, double cena, String tipVozila) {
        this.naziv = naziv;
        this.brLjudi = brLjudi;
        this.cena = cena;
        this.tipVozila = tipVozila;
    }

    public AutoSkola() {
        this.naziv = "";
        this.brLjudi = -1;
        this.cena = -1;
        this.tipVozila = "";
    }

    public void PopustZaMotor() {
        if (tipVozila.equalsIgnoreCase("motor")) {
            cena = cena - (cena * 0.5);
        }
    }

    public int BrGrupa() {
       int grupa=brLjudi/5;
            return grupa;
            }
    public void MogucnostPolaganja(){
        if(tipVozila.equalsIgnoreCase("Autobus")){
            System.out.println("Nije moguce u ovom trenutku polagati voznju za autobus");
        }else{
            System.out.println("Moguce je polagati voznju");
        }
    }
    public String toString(){

            String s1="Autoskolu " + naziv + " upisalo je " + brLjudi + " ljudi po ceni od " + cena + " eura za " + tipVozila;

        return s1;

    }
}
