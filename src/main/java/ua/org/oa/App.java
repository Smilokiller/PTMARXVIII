package ua.org.oa;

public class App {
    public static void main(String[] args) {
        System.out.println("Проверка на высококсность  2016");
        System.out.println(Date.Year.HighYear(2016));//Проверка на высококсность
        System.out.println("Порядковый номер дня в году 15,4,2018");
        System.out.println(Date.Month.getDayOfYear(15,4,2018));//Порядковый номер дня в году
        System.out.println("Количество дней в зaдaнном месяце 4,2018");
        System.out.println(Date.Month.getDays(4,2018));//Количество дней в зaдaнном месяце
        System.out.println("Количество дней между днями 10,10,2017 и 10,10,2018");
        System.out.println(Date.daysBetween(10,10,2017,10,10,2018));
        System.out.println("День недели 5, 3, 2017");
        System.out.println(Date.getDayOfWeek(5, 3, 2017));

    }
}
