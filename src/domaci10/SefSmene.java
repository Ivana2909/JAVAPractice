package domaci10;

public class SefSmene extends Radnik{
    private double nedeljniBonus;
    public SefSmene(String ime, double brSati, double satnica,double nedeljniBonus) {
        super(ime, brSati, satnica);
        this.nedeljniBonus=nedeljniBonus;
    }
    public SefSmene(Radnik r,double nedeljniBonus) {
        super(r.getIme(), r.getBrSati(), r.getSatnica());
        this.nedeljniBonus = nedeljniBonus;

    }
    public double UkuZarada() {
        double zarada = super.UkuZarada() + nedeljniBonus;
        return zarada;
    }
    public void Odmor (){
        if (getBrSati() >= 50) {
            System.out.println(getIme() + " je na odmoru");
        } else {
            System.out.println(getIme() + " nije na odmoru");
        }
    }

    public double getNedeljniBonus() {
        return nedeljniBonus;
    }

    public void setNedeljniBonus(double nedeljniBonus) {
        this.nedeljniBonus = nedeljniBonus;
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
