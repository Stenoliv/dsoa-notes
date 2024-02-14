public class Circular {
    
    static String [] weekdays = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};

    public static void CalculateDays(int todaysDay, int whatDayInFuture){
        System.out.println("Today is " + weekdays[todaysDay] + " The day after tomorrow is " + weekdays[todaysDay+2]);
        int w = whatDayInFuture%6;
        System.out.println(whatDayInFuture + " days from today is a " + weekdays[w]);
    }
}
