package domaci10;

public class Test {
    public static void main(String[] args){
        Radnik r1=new Radnik("Goran", 40,1500);
        Radnik r2=new Radnik("Zeljka", 35,1000);
        Radnik r3=new Radnik("Andjela", 50,1100);


        Fizikalac f=new Fizikalac(r1);
        Masinovodja m1=new Masinovodja(r2);
        SefSmene s1=new SefSmene(r3,5000);

        System.out.println(r1.UkuZarada());
        System.out.println(f.UkuZarada());
        System.out.println(s1.UkuZarada());
        f.Odmor();
        m1.Odmor();
        s1.Odmor();
        System.out.println(s1.toString());

    }
}
