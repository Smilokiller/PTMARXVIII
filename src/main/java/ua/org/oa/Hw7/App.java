package ua.org.oa.Hw7;


import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        WorkWithTreads wwt = new WorkWithTreads();
        wwt.start();

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            if (sc.nextLine() != null) {
                System.out.println("STOP Tread Time Printer");
                wwt.Stop();
                break;
            }
        }

        WorkWithRunable wwr = new WorkWithRunable();

        while (sc.hasNext()) {
            if (sc.nextLine() != null) {
                System.out.println("STOP Runable Time printer");
                wwr.getTh().stop();
                break;
            }
        }
        System.out.println("STOP main");


    }
    }


