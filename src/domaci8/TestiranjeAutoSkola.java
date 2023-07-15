package domaci8;

public class TestiranjeAutoSkola {
    public static void main(String[] args){
        AutoSkola start=new AutoSkola("Start",15,100,"motor");
        AutoSkola djordjevic=new AutoSkola("Djordjevic",32,100,"autobus");


        System.out.println(start);
        System.out.println(djordjevic);
        start.PopustZaMotor();
        System.out.println(start);
        djordjevic.MogucnostPolaganja();
        start.MogucnostPolaganja();
        System.out.println(start.BrGrupa());


    }
}
