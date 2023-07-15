package domaci12;

import java.util.ArrayList;

public abstract class MotornoVozilo extends Tocak{
    //Napraviti apstraktnu klasu MotornoVozilo koja ima atribute za listu Tockova, cenu i godinu
    //proizvodnje. Ova klasa ce imati apstraktne metode:
    private ArrayList<Tocak> brojTockova;
    private double cena;
    private int godinaProizvodnje;

    public MotornoVozilo(int trajanjeGume, boolean ostecenje,
                         double cena, ArrayList<Tocak> brojTockova, double cena1, int godinaProizvodnje) {
        super(trajanjeGume, ostecenje, cena);
        this.brojTockova = brojTockova;
        this.cena = cena1;
        this.godinaProizvodnje = godinaProizvodnje;
    }


  //  public MotornoVozilo(Tocak tocak,ArrayList<Tocak> brojTockova, double cena1, int godinaProizvodnje) {
      // super(tocak.getTrajanjeGume(),tocak.isOstecenje(),tocak.getCena());
      //  this.brojTockova = brojTockova;
     //   this.cena = cena1;
     //  this.godinaProizvodnje = godinaProizvodnje;
  //}
    public MotornoVozilo(ArrayList<Tocak> brojTockova, double cena1, int godinaProizvodnje) {
        this.brojTockova = brojTockova;
        this.cena = cena1;
        this.godinaProizvodnje = godinaProizvodnje;
    }
    public ArrayList<Tocak> getBrojTockova() {
        return brojTockova;
    }

    public void setBrojTockova(ArrayList<Tocak> brojTockova) {
        this.brojTockova = brojTockova;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public int getGodinaProizvodnje() {
        return godinaProizvodnje;
    }

    public void setGodinaProizvodnje(int godinaProizvodnje) {
        this.godinaProizvodnje = godinaProizvodnje;
    }
    public abstract int brojRezervnihGuma();
    public abstract boolean daLiJeOstecen(Tocak t);

    public abstract void removeOstecenu(ArrayList<Tocak> ostecen);
    public abstract void ubaciRezervnu(ArrayList<Tocak> tockovi);

    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder();
        sb.append("Ovo motorno vozilo kosta: ").append(getCena()).append(", proizvedeno je: ").append(getGodinaProizvodnje()).append(" i ima ").append(getBrojTockova().size()).append(" tockova");
        return sb.toString();
    }
}
