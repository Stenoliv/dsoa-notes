import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Helljo ");

       Car car = new Car("Aston-Martin");
       Car car2 = new Car("Alfa-Romeo");

       Bike bike = new Bike();

       System.out.println(car.getName());
       System.out.println(car2.getName());

       System.out.println( Calculator.multiplyMethod(2,3));

        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("Your random number is: " + random.ints(1 , 100).findFirst().getAsInt());

            System.out.println("Press Enter for a new number or Write q to quit");
            if(sc.nextLine().equals("q")){
                System.out.println("Good bye!");
                System.exit(0);

            }
        }



    }
}