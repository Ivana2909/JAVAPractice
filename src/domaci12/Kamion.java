package domaci12;

import java.util.ArrayList;

public class Kamion extends MotornoVozilo{

    public Kamion(int trajanjeGume, boolean ostecenje, double cena,
                  ArrayList<Tocak> brojTockova, double cena1, int godinaProizvodnje) {
        super(trajanjeGume, ostecenje, cena, brojTockova, cena1, godinaProizvodnje);
    }

    public Kamion(ArrayList<Tocak> brojTockova, double cena1, int godinaProizvodnje) {
        super(brojTockova, cena1, godinaProizvodnje);
    }

    @Override
    public int brojRezervnihGuma() {
        return getBrojTockova().size()/2;
    }

    @Override
    public boolean daLiJeOstecen(Tocak t) {
        if(t.getTrajanjeGume()>120)
        return true;
            else
                return false;
    }

    @Override
    public void removeOstecenu(ArrayList<Tocak> ostecen) {
        for (int i = ostecen.size()-1; i >0; i--) {
            if(daLiJeOstecen(ostecen.get(i))){
                ostecen.remove(i);
                //   if (daLiJeOstecen() == true) {
                //     ostecen.remove(i);
            }
            System.out.println(ostecen);
        }
    }
    @Override
    public void ubaciRezervnu(ArrayList<Tocak> tockovi) {
        Tocak t = new Tocak();
        while (getBrojTockova().size() < 12) {
            getBrojTockova().add(t);
        }
    }
    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder();
        for(Tocak t:getBrojTockova())
            sb.append(t.toString()).append("\n");
        return sb.toString();
    }



        }

