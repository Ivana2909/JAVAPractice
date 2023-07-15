package domaci9;

import java.util.ArrayList;

public class Fakultet {
    //b) Napraviti klasu Fakultet koja ima naziv i listu departmana. Unutar ove klase definisati
    //    //metode za:
    //    // 1) ukupan broj ucenika - vraca ukupan broj ucenika sa svih departmana.
    //    // 2) dodavanje predmeta - za departman biologije i matematike dodati 5 strucnih .
    //    // predmeta.
    private String nazivFakulteta;
    private ArrayList<Departman> departman;

    public Fakultet(String nazivFakulteta, ArrayList<Departman> departman) {
        this.nazivFakulteta = nazivFakulteta;
        this.departman = departman;
    }

    public Fakultet(String nazivFakulteta, Departman... departman) {
        this.nazivFakulteta = nazivFakulteta;
        this.departman = new ArrayList<>();
        for (Departman d : departman) {
            this.departman.add(d);
        }

    }

    public String getNazivFakulteta() {
        return nazivFakulteta;
    }

    public void setNazivFakulteta(String nazivFakulteta) {
        this.nazivFakulteta = nazivFakulteta;
    }

    public ArrayList<Departman> getDepartman() {
        return departman;
    }

    public void setDepartman(ArrayList<Departman> departman) {
        this.departman = departman;
    }

    public int ukuBrUcenika() {
        int brUcenika = 0;
        for (Departman d : departman) {
            brUcenika += d.getBrStudenata();
        }
        return brUcenika;
    }

    public int dodajStrucne() {
        int brStrucnih = 0;
        for (Departman d : departman) {
            if (d.getNaziv().equalsIgnoreCase("biologija") || d.getNaziv().equalsIgnoreCase("matematika")) {
                brStrucnih += d.getBrPredmeta() + 5;
            } else {
                brStrucnih += d.getBrPredmeta();
            }
        }

        return brStrucnih;
    }


    @Override
    public String toString() {
       StringBuilder sb=new StringBuilder();
       StringBuilder sb1=new StringBuilder();
        sb.append(getNazivFakulteta()).append(" ima departman ");
      for(Departman d:departman){
          sb1.append(d.getNaziv()).append(" koji ima ").
                  append(d.getBrStudenata()).append(" studenata i ").append(d.getBrPredmeta()).append(" predmeta, ");
      }
      return (sb.toString()+sb1.toString());
    }
}


