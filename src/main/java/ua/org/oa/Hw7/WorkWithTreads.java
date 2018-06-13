package ua.org.oa.Hw7;

import java.io.IOException;
import java.io.InputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import java.util.*;

public class WorkWithTreads extends Thread {
    private boolean flag=true;
    @Override
    public void run() {

        System.out.println("START Thread Time printer");
        while (flag){
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            Date date = new Date();
            System.out.println(dateFormat.format(date));
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void Stop(){
        flag=false;
    }
}

