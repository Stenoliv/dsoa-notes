import java.util.Arrays;

public class StringArray {

    String[] values;

    public StringArray(String[] values) {
        this.values = values;
    }

    public void add(String value) {
        String[] newValues = new String[values.length + 1];


        for (int i = 0; i < values.length; i++) {
            newValues[i] = values[i];
        }
        newValues[values.length] = value;
        values = newValues;

    }

    public void add(int position, String value) {
        add(null);

        for (int i = values.length - 1; i > position; i--) {
            values[i] = values[i - 1];
        }
        values[position] = value;

    }

    public String toString() {
        return Arrays.toString(values);
    }

    public int size() {
        return values.length;
    }

    public void reverse() {
        String[] reversedArray = new String[values.length];

        for (int i = values.length; i > 0; i--) {
            reversedArray[values.length - i] = values[i - 1];
        }
        values = reversedArray;
    }

}
