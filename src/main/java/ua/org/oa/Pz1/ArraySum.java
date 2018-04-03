package ua.org.oa.Pz1;

public class ArraySum {
    int [] ints1;

    public ArraySum(int[] ints1) {
        this.ints1 = ints1;
    }

    public static int Ssum(int [] ints1){
        int Ssum =0;
        for (int anInt :ints1){
            Ssum +=anInt;
        }

        return Ssum;
    }
    public static int err(int []interr){
        int Ssum =0;
        for (int anInt :interr){
            Ssum +=anInt;
        }

        return Ssum;
    }

    public static int sum(int [] ints) {

        int sum = 0;
        for (int anInt : ints){
            sum += anInt;
        }


        return sum;
    }
}
