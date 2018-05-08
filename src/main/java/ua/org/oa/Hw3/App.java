package ua.org.oa.Hw3;

public class App {
    public static void main(String[] args) {
        GenericStorage<String> mas=new GenericStorage<>();
        mas.add("String 1");
        mas.add("String 2");
        mas.add("String 3");
        mas.add("String 4");
        mas.add("String 5");
        mas.add("String 6");
        mas.add("String 7");
        mas.add("String 8");
        mas.add("String 9");
        mas.add("String 10");

        System.out.println(mas.get(2));

        mas.getAll();
        System.out.println(mas.getSize());
        mas.delete(1);

        mas.getAll();
        System.out.println(mas.getSize());

        mas.delete("String 3");
        mas.getAll();
        System.out.println(mas.getSize());

        mas.update(5,"UPDATED");
        mas.getAll();
        System.out.println(mas.getSize());
    }
}
