package ua.org.oa.Hw7;

import lombok.Data;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@Data
public class WorkWithRunable implements Runnable{
    private Thread th;
    public WorkWithRunable() {
        th = new Thread(this);
        th.start();
    }
    @Override
    public void run() {
        System.out.println("START Runable Time Printer");
        while (true){
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            Date date = new Date();
            System.out.println(dateFormat.format(date));
            try {
                th.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public Thread getTh() {
        return th;
    }
}
