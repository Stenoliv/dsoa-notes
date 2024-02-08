public class BogO {

    public BogO() {
        int[] data = new int[100];
        int i;
        int ops = 0;

        for (i = 0; i < data.length; i++) {
            ops++;

        }

        System.out.println(data.length + " Datapoints " + ops + " Operations");

        ops = 0;
        for (i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                ops++;
            }

        }

        System.out.println(data.length + " Datapoints " + ops + " Operations");

        ops = 0;
        int len = data.length;
        while (len > 0) {
            len = len / 2;
            ops++;
        }
        System.out.println(data.length + " Datapoints " + ops + " Operations");
    }


}
