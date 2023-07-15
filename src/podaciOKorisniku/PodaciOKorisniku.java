package podaciOKorisniku;

public class PodaciOKorisniku {

    public static void main(String[] args) {
        String ime = "Ivana ";
        String prezime = "Blagojevic";
        int godRodjenja = 1996;
        int godZaposlenja = 2020;
        int trenutnaGodina = 2023;
        int godRadnogStaza = trenutnaGodina - godZaposlenja;

        System.out.println ("Ime i prezime: " +  (ime + prezime));
        System.out.println ("Godina rodjenja: " + godRodjenja);
        System.out.println ("Godina radnog staza: " + godRadnogStaza);
    }

}
