package domaci9;

public class Departman {
    //a) Napraviti klasu Departman koja ima atribute za naziv departmana(Informatika,
    //matematika, biologija,..), broj studenta na tom departmanu i broj strucnih predmeta na tom
    //departmanu(Ispisati poruku ukoliko korisnik unese negativne brojeve).
    //
    //Definisati odgovarajucu klasu gde ce se testirati ove funkcionalnosti, kao i da definisete
    //konstruktor, get-ere i set-ere i toString za klase a) i b)
    private String naziv;
    private int brStudenata;
    private int brPredmeta;

    private void PostaviBrojStudenata(int brStudenata) {
        if (brStudenata <= 0) {
            this.brStudenata=0;
        } else {
            this.brStudenata = brStudenata;
        }
    }
    private void PostaviBrojPredmeta(int brPredmeta){
        if (brPredmeta <= 0) {
            this.brPredmeta=0;
        } else {
            this.brPredmeta = brPredmeta;
        }
    }

    public Departman(String naziv, int brStudenata, int brPredmeta) {
        this.naziv = naziv;
        PostaviBrojPredmeta(brPredmeta);
        PostaviBrojStudenata(brStudenata);
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getBrStudenata() {
        return brStudenata;
    }

    public void setBrStudenata(int brStudenata) {
        if (brStudenata < 0) {
            System.out.println("Broj studenata ne moze da bude negativan broj");
        } else {
            this.brStudenata = brStudenata;
        }
    }

    public int getBrPredmeta() {
        return brPredmeta;
    }

    public void setBrPredmeta(int brPredmeta) {
        if (brPredmeta < 0) {
            System.out.println("Broj predmeta ne moze da bude negativan broj");
        } else {
            this.brPredmeta = brPredmeta;
        }
    }

    @Override
    public String toString() {
       StringBuilder sb=new StringBuilder();
       sb.append(getNaziv()).append(" ima ").
               append(getBrStudenata()).append(" studenata i ").append(getBrPredmeta()).append(" predmeta");
       return sb.toString();
    }
}




