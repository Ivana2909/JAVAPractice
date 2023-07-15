package domaci12;

import java.util.ArrayList;

public class Automobil extends MotornoVozilo{
    public Automobil(int trajanjeGume, boolean ostecenje, double cena,
                     ArrayList<Tocak> brojTockova, double cena1, int godinaProizvodnje) {
        super(trajanjeGume, ostecenje, cena, brojTockova, cena1, godinaProizvodnje);
    }

    public Automobil(ArrayList<Tocak> brojTockova, double cena1, int godinaProizvodnje) {
        super(brojTockova, cena1, godinaProizvodnje);
    }

    @Override
    public int brojRezervnihGuma() {
     if (getBrojTockova().size() % 2 == 0)
            return getBrojTockova().size() / 2;
        else
                return getBrojTockova().size() / 2 + 1;

}



    public boolean daLiJeOstecen(Tocak t) {
        if(getTrajanjeGume()>365)
            return true;
        else
            return false;
    }

    public void removeOstecenu(ArrayList<Tocak> ostecen) {
        for (int i = ostecen.size()-1; i >0; i--) {
            if (daLiJeOstecen(ostecen.get(i))) {
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
            while (getBrojTockova().size() < 6) {
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
