import cw1.LottoMachine;
import cw2.Animal;
import cw2.Munchkin;
import cw2.Retriver;
import cw3.PersonManager;
import cw4.Square;
import cw5.SportTest;
import cw6.PolygonTest;

public class Main {

    public static void main(String[] args) {
        LottoMachine.run();

        Animal myDog = new Retriver();
        Animal myCat = new Munchkin();
        System.out.println(myDog);
        System.out.println(myCat);

        PersonManager manager = new PersonManager();
        manager.run();

        Square kwadrat = new Square(9);
        kwadrat.printSides();
        System.out.println("Pole powierzchni: "+kwadrat.getArea());

        SportTest.run();

        PolygonTest.run();
    }
}