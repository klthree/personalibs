package personalibs;

/**
 * Converts arrays to ArrayLists. All types accomodated.
 * Input not validated.
 */

import java.util.List;
import java.util.ArrayList;

public class ConvertArray <E> {

    public static ArrayList<Integer> toArrayList1d(int[] arr) {
        ArrayList<Integer> intList = new ArrayList<>(arr.length);

        for (int i = 0; i < arr.length; i++) {
            intList.add(arr[i]);
        }

        return intList;
    }

    public static ArrayList<Double> toArrayList1d(double[] arr) {
        ArrayList<Double> dblList = new ArrayList<>(arr.length);

        for (int i = 0; i < arr.length; i++) {
            dblList.add(arr[i]);
        }

        return dblList;
    }

    public static ArrayList<Boolean> toArrayList1d(boolean[] arr) {
        ArrayList<Boolean> boolList = new ArrayList<>(arr.length);

        for (int i = 0; i < arr.length; i++) {
            boolList.add(arr[i]);
        }

        return boolList;
    }

    public static ArrayList<Character> toArrayList1d(char[] arr) {
        ArrayList<Character> charList = new ArrayList<>(arr.length);

        for (int i = 0; i < arr.length; i++) {
            charList.add(arr[i]);
        }

        return charList;
    }

    public static ArrayList<Short> toArrayList1d(short[] arr) {
        ArrayList<Short> shortList = new ArrayList<>(arr.length);

        for (int i = 0; i < arr.length; i++) {
            shortList.add(arr[i]);
        }

        return shortList;
    }

    public static ArrayList<Long> toArrayList1d(long[] arr) {
        ArrayList<Long> longList = new ArrayList<>(arr.length);

        for (int i = 0; i < arr.length; i++) {
            longList.add(arr[i]);
        }

        return longList;
    }

    public static ArrayList<Byte> toArrayList1d(byte[] arr) {
        ArrayList<Byte> byteList = new ArrayList<>(arr.length);

        for (int i = 0; i < arr.length; i++) {
            byteList.add(arr[i]);
        }

        return byteList;
    }

    public static ArrayList<String> toArrayList1d(String[] arr) {
        ArrayList<String> stringList = new ArrayList<>(arr.length);

        for (int i = 0; i < arr.length; i++) {
            stringList.add(arr[i]);
        }

        return stringList;
    }

    public static ArrayList<Float> toArrayList1d(float[] arr) {
        ArrayList<Float> floatList = new ArrayList<>(arr.length);

        for (int i = 0; i < arr.length; i++) {
            floatList.add(arr[i]);
        }

        return floatList;
    }

    public static <E> ArrayList<E> toArrayList1d(E[] arr) {
        ArrayList<E> elementList = new ArrayList<>(arr.length);

        for (int i = 0; i < arr.length; i++) {
            elementList.add(arr[i]);
        }

        return elementList;
    }
}
