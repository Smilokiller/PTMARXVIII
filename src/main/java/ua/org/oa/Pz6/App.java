package ua.org.oa.Pz6;

public class App {
    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        WorkWithThreads workWithTreads = new WorkWithThreads(thread);
           workWithTreads.writeName();


        WorkWithRunable WorkWithRunable  = new  WorkWithRunable();
        WorkWithRunable.run();



        MyShedule MyShedule = new MyShedule();
        MyShedule.map.put(100,"message 1");
        MyShedule.map.put(200,"message 2");
        MyShedule.map.put(300,"message 3");
        MyShedule.map.put(400,"message 4");
        MyShedule.map.put(500,"message 5");

        MyShedule.run();
    }
}
