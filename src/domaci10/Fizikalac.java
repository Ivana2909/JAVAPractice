package domaci10;

public class Fizikalac extends Radnik{
    public Fizikalac(String ime, double brSati, double satnica) {
        super(ime, brSati, satnica);
    }
    public Fizikalac(Radnik r) {
        super(r.getIme(), r.getBrSati(), r.getSatnica());
    }
    public double UkuZarada() {
        double zarada = super.UkuZarada();
        return zarada;
    }
    public void Odmor() {
        if (getBrSati() >= 40) {
            System.out.println(getIme() + " je na odmoru");
        } else {
            System.out.println(getIme() + " nije na odmoru");
        }
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
