public class Main {
    public static void main(String[] args) {
        cw1 a = new cw1();
        cw2 b = new cw2();
        cw3 c = new cw3(9, "Pela");
        cw4 d = new cw4();
        cw5 e = new cw5();
        cw6 f = new cw6();
        cw8 g = new cw8();
        System.out.println(a.number + ", " + a.text);
        System.out.println(b.number + ", " + b.text );
        System.out.println(c.number + ", " + c.text );
        System.out.println(d.number + "-" + d.text );
        System.out.println(e.otherNumber);
        System.out.println(f.number+", "+f.numbers);
        
        
        dni dzienTygodnia = dni.FRIDAY;
        if (dzienTygodnia.equals(dni.FRIDAY)) {
            System.out.println("true");
        }
        
        
        System.out.println(g.sekundy+" sekunda");
        if (g.sekundy % 2 == 0) {
            System.out.println("Parzyste");
        }
        else {
            System.out.println("Nieparzyste");
        }
        
        
        System.out.println(g.sekundy+" sekunda");
        switch (g.sekundy % 2) {
            case 0:{
                System.out.println("Parzyste");
                        break;}
                case 1:{
                    System.out.println("Nieparzyste");
                        break;}
                default:{
                    System.out.println("NIC");
                }
        }
    }
}
