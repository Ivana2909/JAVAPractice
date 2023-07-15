package domaci13;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args){
        Planina p1=new Planina(2000,"Tara");
        Planina p2=new Planina(2500,"Zlatar");
        Planina p3=new Planina(1200,"Rudnik");
        Planina p4=new Planina(-9,"Sar");
        Planina p5=new Planina(90,"Divcibare");
        ArrayList<Planina> listaPlanina=new ArrayList<>();
        listaPlanina.add(p1);
        listaPlanina.add(p2);
        listaPlanina.add(p3);
        listaPlanina.add(p4);

        Planinar ivana=new Planinar(listaPlanina,2600,16);

       // System.out.println(ivana.clanarina());
       // ivana.popniSe(p5);
      // System.out.println(listaPlanina);
     //   System.out.println(ivana.sviUsponi());
      //  System.out.println(ivana.getMaxUspon());

       // System.out.println(ivana.najvecaPlanina());

       // System.out.println(ivana.toString());
       // System.out.println(p2.toString());
       //System.out.println(listaPlanina);
        //System.out.println(ivana.clanarina());
        p4.toString();


    }
}
