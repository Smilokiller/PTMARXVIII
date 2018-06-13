package ua.org.oa.Pz6;

public class WorkWithRunable implements Runnable{
    Thread thread = Thread.currentThread();
    @Override
    public void run() {
        System.out.println("Runable start!!!");
        for (int i = 0; i <10 ; i++) {
            try {
                Thread.sleep(500);
                System.out.println(thread.getName());
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}
