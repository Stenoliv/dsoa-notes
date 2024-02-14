import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //new BogO();

        String[] charcters = {"Yoda", "R2D2", "Luke", "Leia", "Han", "Obi-Wan", "Chewie", "Aboubakar", "Finn", "Qi"};

        StringArray swc = new StringArray(charcters);

        System.out.println(swc);

        swc.add("Babayaga");

        System.out.println(swc);

        swc.add(3, "Mace");

        System.out.println(swc);

        swc.reverse();

        System.out.println(swc);

        //todays day:: Mon = 0, tues = 1, wed = 2...
        Circular.CalculateDays(2, 15);
    }


}