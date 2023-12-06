import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Forma forma1 = new Forma("Forma generica");
        forma1.stampaArea();
        System.out.println();

        Rettangolo rett1 = new Rettangolo("Rettangolo", 4, 5);
        Triangolo triangoloEqui = new Triangolo("Triangolo Equilat", 5, 3);

        rett1.stampaArea();
        System.out.println();
        triangoloEqui.stampaArea();

    }

}
