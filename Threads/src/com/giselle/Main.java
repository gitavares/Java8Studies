package com.giselle;

import static com.giselle.ThreadColor.ANSI_GREEN;
import static com.giselle.ThreadColor.ANSI_PURPLE;
import static com.giselle.ThreadColor.ANSI_RED;

public class Main {

    public static void main(String[] args) {
        System.out.println(ANSI_PURPLE + "Hello from the main thread");

        Thread anotherThread = new AnotherThread();
        anotherThread.setName("== Another thread ==");
//        anotherThread.run();
        anotherThread.start();

        new Thread(){
            public void run(){
                System.out.println(ANSI_GREEN + "Hello from the anonymous class thread");
            }
        }.start();

        Thread myRunnableThread = new Thread(new MyRunnable(){
            @Override
            public void run() {
                System.out.println(ANSI_RED + "Hello from the anonymous class's implementation of run()");

                try {
//                    anotherThread.join(2000);
                    anotherThread.join();
                    System.out.println(ANSI_RED + "AnotherThread terminated, or timed out, so I'm running again");
                } catch (InterruptedException e){
                    System.out.println(ANSI_RED + "I couldn't wait after all. I was interrupted");
                }
            }
        });

        myRunnableThread.start();
//        anotherThread.interrupt();

        System.out.println(ANSI_PURPLE + "Hello again from the main thread");


    }
}
