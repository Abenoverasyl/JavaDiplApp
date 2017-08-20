
package converter;

public class Convert {
    public int toInteger(String number) {
        return Integer.parseInt(number);
    }
    public String ArraysToString(int array[]) {
        String result = "( ";
        for (int i = 0; i + 1 < array.length; i++) {
            result = result + array[i] + ", ";
        }
        result = result + array[array.length - 1] + " )";
        return result;
    }
}
