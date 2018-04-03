package ua.org.oa.Pz1;

public class ArrayProd {
    public static int sum(int[] ints) {

        int sum = 1;
        for (int anInt : ints) {
            sum = anInt*sum;
        }
        return sum;
    }
}
