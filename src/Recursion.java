public class Recursion {
    static void countdown(int i) {
        if (i < 0) return;
        System.out.print(i + " : ");
        countdown(i-1);
    }
    static int pow(int j, int exp) {
        if (exp <= 1) return j;
        return j * pow(j, exp-1);
    }

}
