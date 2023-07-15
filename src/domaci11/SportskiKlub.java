package domaci11;

import java.util.ArrayList;

public class SportskiKlub{
    ////2)Napraviti klasu SportskiKlub koja ima listu clanova kluba, naziv grada odakle je klub i
    //    //budzet kluba. Definisati metode:
    //    // *isplati - koja vraca kolicinu novca koja ostaje kada se svim clanovima kluba isplate
    //    //plate.
    //    // *prosecnoPlaceni - vraca prosecnu platu svih sportista iz liste.
    //    // *removePreplaceni - izbacuje iz liste sportistu koji je placen vise od proseka.
    //    //3) Napraviti klase Manchester, Arsenal, Spartak koja nasledjuje klasu SportskiKlub.
    //    //Napraviti main metodu gde ce se testirati sve funkcionalnosti, takodje definisati za sve klase
    //    //potrebne konstruktore, get i set metode kao i toString()
    private ArrayList<Sportista> sportista;
    private String gradKluba;
    private double budzet;


    public SportskiKlub(ArrayList<Sportista> sportista, String gradKluba, double budzet) {

        this.sportista = sportista;
        this.gradKluba = gradKluba;
        this.budzet = budzet;
    }
    public SportskiKlub(String gradKluba, double budzet,Sportista...sportista) {
        this.gradKluba = gradKluba;
        this.budzet = budzet;
        for(Sportista s:sportista){
            this.sportista.add(s);
        }
    }

    public ArrayList<Sportista> getSportista() {
        return sportista;
    }

    public void setSportista(ArrayList<Sportista> sportista) {
        this.sportista = sportista;
    }

    public String getGradKluba() {
        return gradKluba;
    }

    public void setGradKluba(String gradKluba) {
        this.gradKluba = gradKluba;
    }

    public double getBudzet() {
        return budzet;
    }

    public void setBudzet(double budzet) {
        this.budzet = budzet;
    }
    public double SumaPlata(ArrayList<Sportista> sportista){
        double sum=0;
        for(Sportista s:sportista){
            sum+=s.getPlata();
        }
        return sum;
    }

    public double Isplata() {
        double ostatak = this.budzet - SumaPlata(sportista);
       // if (ostatak < 0)
         //   System.out.println("Klub nema dovoljno novca da isplati plate");
        // else
             return ostatak;
        }

        public double ProsecnoPlaceni(){
        double prosek=SumaPlata(sportista)/ sportista.size();
        return prosek;
    }
    public void removePreplaceni(ArrayList<Sportista> sportista){
        for(Sportista s:sportista){
            if(s.getPlata()>ProsecnoPlaceni()){
                sportista.remove(s);
            }

        }

    }

    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder();
        sb.append("Klub se nalazi u ").append(getGradKluba()).append(" ,ima budzet od:").append(getBudzet())
                .append(" i broj sportista u klubu je: ").append(sportista.size());
        return sb.toString();
    }
    }

