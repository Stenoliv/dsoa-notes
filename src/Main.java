public class Main {
    public static void main(String[] args) {

        System.out.println("Helljo ");

       Car car = new Car("Aston-Martin");
       Car car2 = new Car("Alfa-Romeo");

       Bike bike = new Bike();

       System.out.println(car.getName());
       System.out.println(car2.getName());

       System.out.println( Calculator.multiplyMethod(2,3));
    }
}