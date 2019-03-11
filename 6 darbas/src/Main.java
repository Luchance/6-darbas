public class Main {
    public static void main(String[] args) {
        //1as
        byte bytas = 1;
        short shortas = 10;
        int intas = 100;
        long longas = 100000L;
        float floatas = 0.1f;
        double doublas = 3.14d;
        boolean booleanas = false;
        char charas = '\u0200';

        //2as

        System.out.println("bytas = " + bytas);
        System.out.println("shortas = " + shortas);
        System.out.println("intas = " + intas);
        System.out.println("longas = " + longas);
        System.out.println("floatas = " + floatas);
        System.out.println("doublas = " + doublas);
        System.out.println("booleanas = " + booleanas);
        System.out.println("charas = " + charas);

        //3as

        int bytas1 = bytas;
        int ats1 = bytas1 + intas;
        System.out.println("atsakymas = " + ats1);

        double floatas1 = floatas;
        double ats2 = floatas1 - doublas;
        System.out.println("atsakymas = " + ats2);

        short bytas2 = bytas;
        short ats3 = (short) (bytas2 / shortas);
        System.out.println("atsakymas = " + ats3);

        int intas2 = charas;
        int ats4 = intas2 * intas;
        System.out.println("atsakymas = " + ats4);

        //4as
        KetvirtaUzduotis klase = new KetvirtaUzduotis();

        System.out.println(klase.uzduotis1); // objekto
        System.out.println(klase.uzduotis2); // statinis
        System.out.println(charas); // vietinis

        //5as

        String specSymbol = "Naudoju \"specialius\" symbolius \n Nauja eilute";
        System.out.println(specSymbol);

        //6as

        int intas1 = 1;
        int intas22 = 2;
        int intas3 = 3;
        int intas4 = -1;
        int intas5 = ++intas3;
        int intas6 = intas1 + intas22 * intas4;

        System.out.println("intas3 = " + intas3);
        System.out.println("intas5 = " + intas5);
        System.out.println("intas6 = " + intas6);

        //7as

        short anotherShort = 12;
        byte anotherByte = 1;
        int anotherInt = 999;
        long anotherLong = anotherByte * anotherShort + anotherInt;
        System.out.println("anotherLong = "+ anotherLong);






    }
}

class KetvirtaUzduotis {
    public int uzduotis1 = 0;
    public static int uzduotis2 = 2;
}
