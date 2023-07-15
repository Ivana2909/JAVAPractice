package domaci13;

import java.util.ArrayList;

public class Planinar implements Planinarenje {
    //-popniSe(Planina p) - Za prosledjenu planinu proveriti da li je njena visina manja od
    //maksimalnog uspona Planinara, ako jeste, dodati je u listu Planina.
    //-clanarina() - Vraca koliko kosta clanarina, znamo da je fiksno 1000 dinara, plus
    //dobijamo 2% popusta za svaku planinu na koju se Planinar popeo.
    //-sviUsponi() - Vraca koliko se sve ukupno Planinar popeo kada se saberu sve visine
    //planina na koje se on popeo.
    //** Opciona metoda= najvecaPlanina() - Vraca najvecu planinu iz liste.
    private ArrayList<Planina> listaPlanina;
    private double maxUspon;
    private double tezinaOpreme;

    public Planinar(ArrayList<Planina> listaPlanina, double maxUspon, double tezinaOpreme) {
        this.listaPlanina = listaPlanina;
        this.maxUspon = maxUspon;
        this.tezinaOpreme = tezinaOpreme;
    }

    public Planinar() {
        this.listaPlanina = new ArrayList<>();
        this.maxUspon = 0;
        this.tezinaOpreme = 0;
    }


    public ArrayList<Planina> getListaPlanina() {
        return listaPlanina;
    }

    public void setListaPlanina(ArrayList<Planina> listaPlanina) {
        this.listaPlanina = listaPlanina;
    }

    public double getMaxUspon() {
        return maxUspon;
    }

    public void setMaxUspon(double maxUspon) {
        this.maxUspon = maxUspon;
    }

    public double getTezinaOpreme() {
        return tezinaOpreme;
    }

    public void setTezinaOpreme(double tezinaOpreme) {
        this.tezinaOpreme = tezinaOpreme;
    }

    @Override
    public void popniSe(Planina p) {
        if (p.getVisina() < this.maxUspon) {
            listaPlanina.add(p);
        }
    }

    @Override
    public double clanarina() {
        double clanarina = 1000 - (1000 * (listaPlanina.size() * 0.02));
        return clanarina;
    }

    @Override
    public double sviUsponi() {
        double suma = 0;
        for (int i = 0; i < listaPlanina.size(); i++) {
            suma += getListaPlanina().get(i).getVisina();
        }
        return suma;
    }

    @Override
    public double najvecaPlanina() {
        double max = Double.MIN_VALUE;
        for (int i = 0; i < listaPlanina.size(); i++) {
            if (getListaPlanina().get(i).getVisina() > max) {
                max = getListaPlanina().get(i).getVisina();
            }
        }
        return max;
    }


        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Planinar se popeo na maksimalan uspon od: ")
                    .append(getMaxUspon()).append(" metara i nosi opremu tezine: ")
                    .append(getTezinaOpreme()).append(" kg.").append(" Planinar se popeo na ")
                    .append(getListaPlanina().size()).append(" planina, ukupnih visina ").append(sviUsponi());
            return sb.toString();
        }
    }

