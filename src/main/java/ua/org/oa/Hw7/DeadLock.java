package ua.org.oa.Hw7;

public class DeadLock {
    public static void main(String[] args) {
        final Object lock1 = new Object();
        final Object lock2 = new Object();
        Thread t1 = new Thread("Deadlock Test T1") {
            public void run() {
                synchronized (lock1) {
                    try {
                        Thread.sleep(150L);
                    } catch (Throwable ignored) {
                    }
                    synchronized (lock2) {
                        try {
                            Thread.sleep(30L);
                        } catch (Throwable ignored) {
                        }
                        lock2.notify();
                    }
                    lock1.notify();
                }
            }
        };
        Thread t2 = new Thread("Deadlock Test T2") {
            public void run() {
                synchronized (lock2) {
                    try {
                        Thread.sleep(150L);
                    } catch (Throwable ignored) {
                    }
                    synchronized (lock1) {
                        try {
                            Thread.sleep(300L);
                        } catch (Throwable ignored) {
                        }
                        lock1.notify();
                    }
                    lock2.notify();
                }
            }
        };
        t1.start();
        t2.start();
    }
}
