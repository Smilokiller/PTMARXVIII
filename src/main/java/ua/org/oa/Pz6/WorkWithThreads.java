package ua.org.oa.Pz6;

public class WorkWithThreads extends Thread{
    Thread mainThread;

    public WorkWithThreads(Thread mainThread) {
        this.mainThread = mainThread;
    }

    public void writeName(){
        System.out.println("Thread start!!!");
        for (int i = 0; i <10 ; i++) {
            try {
                Thread.sleep(500);
                System.out.println(currentThread().getName());
            } catch (InterruptedException e) {
                return;
            }
        }

    }


}
