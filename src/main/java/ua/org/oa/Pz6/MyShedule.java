package ua.org.oa.Pz6;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;
@Data
public class MyShedule extends Thread {
    Map<Integer, String> map = new HashMap();
    Thread thread = Thread.currentThread();
    int time;
    String message;

//  public int getTime(Map<Integer , String> map ){
//      for (Map.Entry<Integer, String> integerStringEntry : map.entrySet()) {
//       integerStringEntry.getKey();
//      }
//      return time;
//
//  }
//  public  String getMessage(Map<Integer , String> map){
//      for (Map.Entry<Integer, String> entry : map.entrySet()) {
//          message = entry.getValue();
//      }
//return message;
//  }


    public void work(Map<Integer, String> map) {

        for (Map.Entry<Integer, String> integerStringEntry : map.entrySet()) {
            time = integerStringEntry.getKey();
            try {
                sleep(time);
                System.out.println(integerStringEntry.getValue());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void run(){
        work(map);
    }
}
