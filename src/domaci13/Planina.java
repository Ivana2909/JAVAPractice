package domaci13;

public class Planina {
    private double visina;
    private String nazivPlanine;

    public Planina(double visina, String nazivPlanine) {
        if(visina<=0){
            this.visina=0;
            System.out.println("Planina ne moze da bude visoka 0m ili manje!");
        }else {
            this.visina = visina;
        }
        this.nazivPlanine = nazivPlanine;
    }

    public Planina() {
        this.visina = 0;
        this.nazivPlanine = "";
    }

    public double getVisina() {
        return visina;
    }

    public void setVisina(double visina) {
        if(visina<=0){
            this.visina=0;
            System.out.println("Planina ne moze da bude visoka 0m ili manje!");
        }else {
            this.visina = visina;
        }
    }

    public String getNazivPlanine() {
        return nazivPlanine;
    }

    public void setNazivPlanine(String nazivPlanine) {
        this.nazivPlanine = nazivPlanine;
    }

    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder();
        sb.append(getNazivPlanine()).append(" je visoka ").append(getVisina()).append(" metara");
        return sb.toString();
    }
}
