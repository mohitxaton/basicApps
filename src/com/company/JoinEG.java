package com.company;

public class JoinEG implements Runnable {

    public void run() {

        Thread t = Thread.currentThread();
        System.out.print(t.getName());
        //checks if this thread is alive
        System.out.println(", status = " + t.isAlive());
    }

    public static void main(String args[]) throws Exception {

            Thread t1 = new Thread(new MyRunnable(), "t1");
            Thread t2 = new Thread(new MyRunnable(), "t2");
            Thread t3 = new Thread(new MyRunnable(), "t3");

            t1.start();

            //start second thread after waiting for 2 seconds or if it'Test.java dead
            /*try {
                t1.join(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/

            t2.start();

            //start third thread only when first thread is dead
            /*try {
                t1.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/

            t3.start();

           /* t2.yield();
        t2.yield();
        t2.yield();
        t2.yield();
        t2.yield();
        t2.yield();*/



            //let all threads finish execution before finishing main thread
            try {
                t1.join();
                t2.join();
                t3.join();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

            System.out.println("All threads are dead, exiting main thread");

    }


    static class MyRunnable implements Runnable{

        @Override
        public void run() {
            System.out.println("Thread started:::"+Thread.currentThread().getName());
            try {
                for (int i = 0; i <= 3; i++){
                    Thread.sleep(4000);
                    System.out.println("Thread running:::"+Thread.currentThread().getName());
                }

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread ended:::"+Thread.currentThread().getName());
        }

    }

} 