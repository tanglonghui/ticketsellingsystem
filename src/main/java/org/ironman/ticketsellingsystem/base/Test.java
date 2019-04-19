package org.ironman.ticketsellingsystem.base;

public class Test {
    public static void main(String[] args)  {
       Test3();
    }

    public static  void Test1() {
        String str = "你好1";
        byte[] i1 = str.getBytes();
        for (byte i :
                i1) {
            System.out.println(i);
        }
    }

    public static void Test2() {
        ThreadA t1 = new ThreadA();
        new Thread(t1,"A").start();
        new Thread(t1,"B").start();
        new Thread(t1,"C").start();
        new Thread(t1,"D").start();
    }
    public static void Test3() {
        Double x=1.555555555555555;
        Double y=1.55555555555555555;
        System.out.println(x*y);
    }



}

class ThreadA implements Runnable{
    Object lock = new Object();
    private int tickets = 10;


    @Override
    public void run() {
        synchronized (lock) {

        while (tickets > 0) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {

            }
                System.out.println(Thread.currentThread().getName() + "--剩余票" + tickets--);
            }
        }
    }
}