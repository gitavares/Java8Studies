package com.giselle;

import static com.giselle.ThreadColor.ANSI_RED;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(ANSI_RED + "Hello from MyRunnables implementation of run()");
    }
}
